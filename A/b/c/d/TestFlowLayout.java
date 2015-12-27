import java.awt.*;
public class TestFlowLayout{
	public static void main(String[] args){
		Frame f = new Frame("this is frame name");
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setSize(100,100);
		f.setVisible(true);	
	}
	
}