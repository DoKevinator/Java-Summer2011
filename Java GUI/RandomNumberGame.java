import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RandomNumberGame extends JFrame {
	private int guess, randomNum;
	private JButton button;
	private JTextField textfield;
	private JLabel prompt;
	private JLabel result;
	private JLabel random;
	private JMenuBar menubar;
	private JMenu file;
	private JMenuItem exit;
	
	public RandomNumberGame() {
		setLayout( new FlowLayout() );
		
		menubar = new JMenuBar();
		setJMenuBar( menubar );
		
		file = new JMenu( "File" );
		menubar.add( file );
		
		exit = new JMenuItem( "Exit" );
		file.add( exit );
		
		prompt = new JLabel( "Guess a number from 1-10!" );
		add( prompt );
		
		textfield = new JTextField(2);
		add( textfield );
		
		button = new JButton( "Guess!" );
		add(button);
		
		result = new JLabel( "" );
		add( result );
		
		random = new JLabel( "" );
		add( random );
		
		event e = new event();
		button.addActionListener(e);
		
		event2 ev = new event2();
		exit.addActionListener(ev);
	}
	
	public class event2 implements ActionListener {
		public void actionPerformed( ActionEvent ev ) {
			System.exit(0);
		}
	}
	
	public class event implements ActionListener {
		public void actionPerformed( ActionEvent e ) {
			randomNum = (int) (Math.random() * 10 + 1 );
				try {	
					guess = (int) (Double.parseDouble( textfield.getText() ) );
			
					if ( guess == randomNum ) {
						result.setText( "You won the game!" );
					} else if ( guess != randomNum ) {
						result.setText( "You lost the game!" );
					  }
			
					random.setText( "The random number was: " + randomNum );
					
				} catch ( Exception a ) {
					random.setText( "Please enter in an integer." );
				  }
		
		}
	}
	
	public static void main( String[] args ) {
		RandomNumberGame gui = new RandomNumberGame();
		
		gui.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		gui.setVisible(true);
		gui.setTitle( "Random Number Guessing Game!" );
		gui.setSize( 300,150 );
	}
}