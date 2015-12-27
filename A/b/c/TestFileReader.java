import java.io.*;
public class TestFileReader{
	public static void main(String[] args){
		FileReader fr =null;
		int c =0;
					
		try{
			fr = new FileReader("C:/java/A/b/c/TestFileOutputStream.java");	
			int ln=0;
			while((c= fr.read()) != -1){
			  System.out.print((char)c);
			}
			fr.close();
		}		
		catch(FileNotFoundException e){  System.out.println("找不到文件");	}
		catch(IOException e){  System.out.println("读取错误");   }
		
	}
	
	
}