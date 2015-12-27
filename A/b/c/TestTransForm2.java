import java.io.*;
public class TestTransForm2{
	public static void main (String [] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = null;
		try{
			s = br.readLine();
			while(s!=null){          //字符串不能与0比较，应该和null不叫
				if(s.equalsIgnoreCase("exit")) {break;}
				System.out.println(s.toUpperCase());
				s = br.readLine();
				
			}
			
			
			br.close();
		}
		catch(FileNotFoundException e){System.out.print("找不到文件");}
		catch(IOException e){ e.printStackTrace();}
		
		
		
	}
	
	
	
}