import java.io.*;
public class TestDataStream{
	public static void main(String []args){
		//每次使用BYteArrayInputStream就会产生一个新的固定大小的字符数组用于写入数据。
		try{
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
		    DataOutputStream dos = new DataOutputStream(bos);
			
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			
			//toByteArray()方法是创建一个新的字节数组
			ByteArrayInputStream bis2 = new ByteArrayInputStream(bos.toByteArray()); //非常重要，注意参数
			System.out.println(bis2.available()); //显示bis2数组内可以供读取的字节数。
			DataInputStream dis2 = new DataInputStream(bis2);
			
			System.out.println(dis2.readDouble());
			System.out.println(dis2.readBoolean());
			dos.close();
			dis2.close();
		}
		
		catch(IOException e){e.printStackTrace();}
		
		
	}
	
}