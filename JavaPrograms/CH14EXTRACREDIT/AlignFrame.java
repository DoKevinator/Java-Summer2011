import javax.swing.*;
import java.awt.*;

public class AlignFrame extends JFrame
{
	private JTextField Xcoordinate;
	private JTextField Ycoordinate;
	private JRadioButton showGrid;
	private JRadioButton snapGrid;
	private JButton ok;
	private JButton cancel;
	private JButton help;
	private JLabel X;
	private JLabel Y;
	private FlowLayout layout;
	private Container container;
	
	public AlignFrame()
	{
		super( "Align" );
		
		layout = new FlowLayout();
		container = getContainerPane();
		setLayout( layout );
		
		snapGrid = new JRadioButton( "Snap to Grid", false );
		add( snapGrid );
		
		showGrid = new JRadioButton( "Show Grid", false );
		add( showGrid );
		
		
		X = new JLabel( "X:" );
		add( X );
		Xcoordinate = new JTextField( "   " );
		add( Xcoordinate );
		
		Y = new JLabel( "Y:" );
		add( Y );
		Ycoordinate = new JTextField( "   " );
		add( Ycoordinate );
		
		ok = new JButton( " Ok " );
		add( ok );
		
		cancel = new JButton( " Cancel " );
		add( cancel );
		
		help = new JButton( " Help " );
		add( help );
	}
}