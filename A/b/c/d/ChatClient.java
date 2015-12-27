import java.io.*;
import java.net.*;
public class ChatClient{
	public static void main(String [] args){			
		try{
			Socket s = new Socket("127.0.0.1",8888); 
			
			BufferedReader crr = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader cr = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter    ow = new PrintWriter(s.getOutputStream());
			
			String str = null;
			str = crr.readLine();
			while(!str.equals("exit")){
				
				ow.println(str);
				ow.flush();
				System.out.println("Client: "+str);
				System.out.println("Server: "+cr.readLine());
				str = crr.readLine();				
				
			}
		
			ow.flush();
			crr.close();
			cr.close();
			ow.close();
			

			
		}
		
		catch(Exception e){System.out.println("error");}
			
		
				
		
		
		
	}
	
	
}