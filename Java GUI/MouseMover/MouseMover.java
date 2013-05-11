import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseMover extends JFrame {
	private JLabel label1, label2, label3, label4, errorLabel;
	private JTextField tf1, tf2, tf3, tf4;
	private JButton button;
	private JMenuBar menubar;
	private JMenu file;
	private JMenuItem about;
	private JMenuItem exit;
	
	public MouseMover() {
		setLayout( new GridLayout( 5, 2, 5, 5 ) );
		
		menubar = new JMenuBar();
		setJMenuBar( menubar );
		
		file = new JMenu( "File" );
		menubar.add(file);
		
		about = new JMenuItem( "About" );
		file.add( about );
		
		event3 e3 = new event3();
		about.addActionListener(e3);
		
		exit = new JMenuItem( "Exit" );
		file.add( exit );
		
		event2 ex = new event2();
		exit.addActionListener(ex);
		
		label1 = new JLabel( "Enter in number of mouse movements: " );
		add( label1 );
		
		tf1 = new JTextField();
		add( tf1 );
		
		label2 = new JLabel( "Enter in mouse movement delay in milliseconds: " );
		add( label2 );
		
		tf2 = new JTextField();
		add( tf2 );
		
		label3 = new JLabel( "Enter in width of screen: " );
		add( label3 );
		
		tf3 = new JTextField();
		add( tf3 );
		
		label4 = new JLabel( "Enter in height of screen: " );
		add( label4 );
		
		tf4 = new JTextField();
		add( tf4 );
		
		button = new JButton( "Start!" );
		add( button );
		
		errorLabel = new JLabel( "" );
		add( errorLabel );
		
		event e = new event();
		button.addActionListener(e);
	}
	

	
	public class event3 implements ActionListener {
		public void actionPerformed( ActionEvent e3 ) {
			JOptionPane.showMessageDialog( null, "Created by Kevin Do. Be sure to enter in the correct screen size by pixels! I also recommend setting the movement number to 30 and the delay to 300.", "About", JOptionPane.PLAIN_MESSAGE );
		}
	}
	
	public class event2 implements ActionListener {
		public void actionPerformed( ActionEvent ex ) {
			System.exit(0);
		}
	}
	
	public class event implements ActionListener {
		public void actionPerformed( ActionEvent e ) {
			try {
				int movement = (int) (Double.parseDouble( tf1.getText() ) );
				int delay = (int) (Double.parseDouble( tf2.getText() ) );
				int width = (int) (Double.parseDouble( tf3.getText() ) );
				int height = (int) (Double.parseDouble( tf4.getText() ) );
				
				if( movement <= 0 || delay <= 0 || width <= 0 || height <= 0 ) {
					errorLabel.setText( "Please enter in positive values." );	
				} else {
					errorLabel.setText( "" );
				  
				
						try {
							Robot rob = new Robot();
							for( int x = 0; x <= movement; x++ ) {
								rob.mouseMove( (int) (Math.random() * width), (int) (Math.random() * height) );
								rob.delay( delay );
							}
						} catch (AWTException a) { 
								System.exit(0);
						  }
				  }
						  
					} catch( Exception b ) {
			 		 		errorLabel.setText( "Please enter in only numbers." );
					  }
			  
			      
		}
	}
	
	public static void main ( String[] args) {
		MouseMover gui = new MouseMover();
		gui.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		gui.setVisible(true);
		gui.setTitle( "Mouse Mover Virus Program!" );
		gui.pack();
		
	}
}