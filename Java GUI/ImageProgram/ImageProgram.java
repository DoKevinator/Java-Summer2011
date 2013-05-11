import java.awt.*;
import javax.swing.*;

public class ImageProgram extends JFrame {
	private ImageIcon image;
	private JLabel label;
	private JButton button;
	
	ImageProgram() {
		setLayout( new FlowLayout() );
		
		image = new ImageIcon( getClass().getResource("God-bless-tumblr-tumblr-31201634-436-291.jpg") );
		
		label = new JLabel(image);
		add(label);
		
		image = new ImageIcon( getClass().getResource("God-bless-tumblr-tumblr-31201634-436-291.jpg") );
		
		button = new JButton(image);;
		add(button);
	}
	
	public static void main ( String[] args){
		ImageProgram test = new ImageProgram();
		
		test.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		test.setVisible(true);
		test.pack();
		test.setTitle("ImageProgram");
	}
}