
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Beeper extends JFrame {
	private JButton button;
	private JLabel label;
	private int counter;
	private int x;
	private String s;
	
	public Beeper() {
		setLayout( new FlowLayout() );
		
		button = new JButton( "Click for sound" );
		add( button );
		
		label = new JLabel( "" );
		add( label );
		
		event e = new event();
		button.addActionListener(e);
	}
	
	public class event implements ActionListener {
		public void actionPerformed( ActionEvent e ) {
			Toolkit.getDefaultToolkit().beep();
			
			counter++;
			if( x == 0 ) {
				s = "time";
			} else if( x == 1 ) {
				s = "times";
			}
			
			label.setText( "You have clicked the button " + counter + " " + s );
			x = 1;
		}
	}
	
	public static void main( String[] args ) {
		Beeper gui = new Beeper();
		
		gui.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		gui.setVisible(true);
		gui.setTitle( "Beeper Program" );
		gui.setSize( 300,150 );
	}
}