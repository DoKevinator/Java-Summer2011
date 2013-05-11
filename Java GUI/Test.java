import java.awt.*;
import javax.swing.*;

public class Test extends JFrame {

	private JLabel label;
	private JButton button;
	private JTextField textfield;
	
	public Test()
	{
		setLayout( new FlowLayout() );
		
		label = new JLabel("I am a label.");
		add(label);
		
		button = new JButton("click here");
		add(button);
		
		textfield = new JTextField(20);
		add(textfield);
	}
	
	public static void main ( String[] args){
		Test test = new Test();
		
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setVisible(true);
		test.setSize(400,200);
		test.setTitle( "Hello this is a test GUI");
	}
	
}