import java.awt.*;
import java.awt.event.*;
public class TFMath{
	public static void main(String [] args){
		new TFFMath().launchFrame();
		
	}
	
}

class TFFMath extends Frame{
	TextField num1,num2,num3;
	public void launchFrame(){
		num1 = new TextField(10);	
		num2 = new TextField(10);
		num3 = new TextField(15);
		Button b1 = new Button("=");
		Label lplus = new Label("+");
		b1.addActionListener(new Mymonitor());
		setLayout(new FlowLayout());
		add(num1);
		add(lplus);
		add(num2);
		add(b1);
		add(num3);				
		pack();
		setVisible(true);		
		
	}
	private class Mymonitor implements ActionListener{
	
		public void actionPerformed(ActionEvent e){
			int i = Integer.parseInt(num1.getText());
			int j = Integer.parseInt(num2.getText());
			num3.setText(""+ (i+j));
		
		
		
		}
	
	
	}
}








