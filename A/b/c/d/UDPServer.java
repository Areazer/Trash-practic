import java.net.*;
public class UDPServer{
	public static void main(String[] args)throws Exception{
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		DatagramSocket ds = new DatagramSocket(5678);
		while(true){
			ds.receive(dp);
			System.out.println(new String(buf,0,buf.length)); //通过字节数组的一部分来new一个字符串
			
		}
		
		
	}
	
	
}