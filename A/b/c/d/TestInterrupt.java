import java.util.*;
public class TestInterrupt{
	public static void main(String []args){
		Mythread thread = new Mythread();
		Thread t = new Thread(thread);
		t.start();
		try{
		  System.out.println("main work");
		  Thread.sleep(1000);
		}
		catch(InterruptedException e){}
		t.interrupt();
		
	}
	
}

class Mythread implements Runnable{
	public void run(){
		boolean flag = true;
		try{			
		    while(flag){
				Thread.sleep(1000);
				System.out.println("----"+ new Date() + "----");
				flag = false;		
			
		    }
		}
		catch(InterruptedException e){return;}
	}
}