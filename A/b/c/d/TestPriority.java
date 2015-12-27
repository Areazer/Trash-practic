import java.util.*;
public class TestPriority{
	public static void main(String[] args){
		Thread t1 = new Thread(new Mythread1());
		Thread t2 = new Thread(new Mythread2());
		t1.setPriority(Thread.NORM_PRIORITY +3);
		t1.start();
		t2.start();				
	}
	
}

class Mythread1 implements Runnable{
	public void run(){
		for(int i=0;i<=100;i++){
			System.out.println("mythread1= " + i);
			
		}
		
	}
	
}

class Mythread2 implements Runnable{
	public void run(){
		for(int i=0;i<=100;i++){
			System.out.println("mythread2= " + i);
			
		}
		
	}
	
}
