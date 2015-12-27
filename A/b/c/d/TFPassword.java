import java.awt.*;
import java.awt.event.*;
public class TFPassword{
	public static void main(String [] args){
		new TFFrame();			
	}
	
}

class TFFrame extends Frame{
	TFFrame(){
		TextField tf = new TextField();
		add(tf);
		tf.addActionListener(new TPActionListener());
		tf.setEchoChar('*');
		pack();
		tf.setVisible(true);				
	
	}
	
}

class TPActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		TextField tf = (TextField)e.getSource();
		System.out.println(tf.getText());
		
	}
	
	
}