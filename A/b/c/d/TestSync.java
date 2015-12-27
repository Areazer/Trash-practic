
public class TestSync implements Runnable{
	Timer timer = new Timer();
	public static void main(String[] args){
		TestSync test = new TestSync();
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();		
	}
	
	public void run(){
		timer.add(Thread.currentThread().getName());	
	}
	
}


class Timer{
	private int i =0;
	public  synchronized void add(String name){ //该行有没有synchronized决定了线程执行时对象被不被锁定
		i++;
		try{
			Thread.sleep(1);
		}
		catch(InterruptedException e){}
			System.out.println(name +" NO " +i );
		
		
		
		
		
	}
	
}