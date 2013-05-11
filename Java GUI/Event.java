import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Event extends JFrame {
	private JButton button1;
	private JButton button2; 
	private JLabel label1;
	private JLabel label2;
	private ImageIcon image;
	private boolean x = false, y = false;
	
	public Event() {
		setLayout( new FlowLayout() );
		
		image = new ImageIcon( getClass().getResource("God-bless-tumblr-tumblr-31201634-436-291.jpg") );
		
		button1 = new JButton(image);
		add(button1);
		
		label1 = new JLabel("");
		add(label1);
		
		button2 = new JButton("Click here" );
		add(button2);
		
		label2 = new JLabel( "" );
		add(label2);
		
		Events awesome = new Events();
		button1.addActionListener(awesome);
		
		Events2 awesome2 = new Events2();
		button2.addActionListener(awesome2);
		
	}
	
	public class Events implements ActionListener {
		public void actionPerformed( ActionEvent awesome ) {
			if ( x == false ){
				label1.setText( "Now you see Tumblr here!" );
				x = true;
			} else if ( x == true ) {
				label1.setText( "" );
				x = false;	
			}
		}
	}
	
	public class Events2 implements ActionListener {
		public void actionPerformed( ActionEvent awesome2 ) {
			if ( y == false ) {
				label2.setText( "Here is the second label" );
				y = true;
			} else if ( y == true ) {
				label2.setText( "" );
				y = false;
			}
		}
	}
	
	public static void main ( String[] args) {
		Event gui = new Event();
		gui.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		gui.setVisible(true);
		gui.setTitle( "Event Program" );
		gui.setSize( 600,600 );
	}
}