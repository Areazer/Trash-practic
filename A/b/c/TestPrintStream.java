import java.io.*;
import java.util.*;
public class TestPrintStream {
	public static void main(String [] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		FileWriter fr = new FileWriter ("C:/java/A/b/c/log.txt");		
		PrintWriter log = new PrintWriter (fr);
		String s = null;
		try{
			while((s=br.readLine())!=null){
			if(s.equalsIgnoreCase("exit")) break;
			System.out.println(s.toUpperCase());
			
			log.println("------");
			log.println(s.toUpperCase());
			log.flush();			
		}
		
		log.println("====="+ new Date()+ "====="); //必须输入exit退出while循环后才会输出这行日期
		log.flush();
		log.close();
		}
		
		catch(IOException e ){ e.printStackTrace(); }
		
	
	
	}
	
	
}