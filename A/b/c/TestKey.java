import java.awt.*;
import java.awt.event.*;
public class TestKey{
	public static void main(String []args){
		new MyFrame().launchFrame();					
	}		
}

class MyFrame extends Frame{
	public void launchFrame(){
		setSize(200,200);
		setLocation(300,300);
		addKeyListener(new Mymonitor());
		setVisible(true);
		
		
	}
	
	class Mymonitor extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			int keycode = e.getKeyCode();
			if(keycode== KeyEvent.VK_UP ){
				System.out.println("up");
			}
			
		}
		
	}
	
}