import java.net.*;
public class UDPClient{
	public static void main(String [] args)throws Exception{
		byte[] b =(new String ("Hello")).getBytes();
		DatagramPacket p = new DatagramPacket(b,b.length,new InetSocketAddress("127.0.0.1",5678));
		                   
		DatagramSocket socket = new DatagramSocket(9999);
		socket.send(p);
		socket.close();
		
		
		
	}
	
	
}