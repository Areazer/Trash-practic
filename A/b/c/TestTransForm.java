import java.io.*;
public class TestTransForm{
	public static void main(String []args){
		try{
			
		  OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("C:/java/A/b/c/lol.txt"));
		  osr.write("wowowowow");
		  System.out.println(osr.getEncoding());
		  
		  osr.close();
		  
		  osr = new OutputStreamWriter(new FileOutputStream("C:/java/A/b/c/lol.txt",true),"ISO8859_1");   
		  //true的意思是在原来文件的末尾继续写入数据，否则会擦除原文件的内容重新写入。
		  osr.write("asdasasdasd");
		  System.out.println(osr.getEncoding());
		  osr.flush();
		  osr.close();
		}
		catch(FileNotFoundException e){System.out.println("找不到文件");}
		catch(IOException e){System.out.println("读取错误");}
		
		
		
		
		
	}
	
}