import java.io.*;
public class TestFileWriterAll{
  public static void main(String [] args){
	FileWriter rd =null;
	
	try{
		rd = new FileWriter("C:/java/A/b/c/unicode.dat");
		for(int a=0;a<=50000;a++){
			rd.write(a);
		}
		rd.close();
	}
	catch(IOException e){
		e.printStackTrace();
		System.out.println("读取错误");
		System.exit(-1);
		
	}
	
  }
	
}