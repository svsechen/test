package file;

import info.monitorenter.cpdetector.io.ASCIIDetector;
import info.monitorenter.cpdetector.io.CodepageDetectorProxy;
import info.monitorenter.cpdetector.io.JChardetFacade;
import info.monitorenter.cpdetector.io.ParsingDetector;
import info.monitorenter.cpdetector.io.UnicodeDetector;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class FileEncodingTest {
	public static void main(String[] args) {
		try {
			String filename = "d:/temp/temp.txt";
		//	String filename = "D:/temp/market/preins_info_sale_20111201.txt";
			File file = new File(filename);
			if (!file.getParentFile().exists()) {
				file.getParentFile().mkdirs();
			}
			FileOutputStream fos = new FileOutputStream(file);
			OutputStreamWriter w = new OutputStreamWriter(fos, "GBK");
			w.write("hello，你好!");
			w.flush();
			w.close();
			
/*			FileOutputStream fos = new FileOutputStream(file);
			fos.write("hello，你好!".getBytes("GBK"));
			fos.flush();
			fos.close();*/
			
			CodepageDetectorProxy detector =  CodepageDetectorProxy.getInstance();  
			detector.add(new ParsingDetector(false)); 
			detector.add(JChardetFacade.getInstance());
			  //ASCIIDetector用于ASCII编码测定
			detector.add(ASCIIDetector.getInstance());
			  //UnicodeDetector用于Unicode家族编码的测定
			detector.add(UnicodeDetector.getInstance());
			
			  Charset charset = null;
			  try {
			     charset = detector.detectCodepage(new BufferedInputStream(new FileInputStream(file)),200);
			      //charset = detector.detectCodepage(file.toURI().toURL());
			  } catch (Exception ex) {ex.printStackTrace();}
			  if(charset!=null){
			       System.out.println(file.getName()+"编码是："+charset.name());
			  }else{
				  System.out.println(file.getName()+"未知");				  
			  }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
