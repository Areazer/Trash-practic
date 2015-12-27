import java.util.*;
public class TestJoin{
	public static void main(String[] args){
	    Mythread1 thread = new Mythread1();
	    Thread t1 = new Thread(thread);
	    t1.start();
	    try{
	    	t1.join();
	    	for(int i=0;i<5;i++){
	    	    System.out.println("main=" + i);		
	        }
		}
	    catch(InterruptedException e){}
	
	
    }
}

class Mythread1 implements Runnable{
	public void run(){
		
			for(int i=0;i<5;i++){
			    System.out.println("thread1=" + i);
			}
			
		
		
		
			
		
		
	}
	
}