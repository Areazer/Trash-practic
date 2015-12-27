import java.io.*;
import java.net.*;
public class ChatServer{
	public static void main(String [] args){
		
		try{
			ServerSocket ss = new ServerSocket(8888);			
			Socket s = ss.accept();
			BufferedReader srr = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter ow = new PrintWriter(s.getOutputStream());
			BufferedReader sr = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			System.out.println("Client: "+ sr.readLine());	//非常重要 没有的话会导致无法立刻收信
			
			String str2=null;
			str2 = srr.readLine();
			
			while(!str2.equals("exit")){
				
				
				
				ow.println(str2);
				ow.flush();
				System.out.println("Server: "+ str2);
				System.out.println("Client: "+ sr.readLine());	
				str2 = srr.readLine();
			}
			
			
			ow.flush();
			srr.close();
			sr.close();
			ow.close();
			s.close();
			
			
		}
		
		catch(Exception e){System.out.println("error");}
		
				
		
		
		
	}
	
}