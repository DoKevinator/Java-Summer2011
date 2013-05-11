import javax.swing.JOptionPane;
public class TipsterGuified {
    public static void main(String args[])
    {
        String inputString = JOptionPane.showInputDialog(null, "Enter Subtotal", "TipsterGuified Table", JOptionPane.QUESTION_MESSAGE);
        

        double subtotal = double.parseDouble(inputToString);

        String gratuityRate = JOptionPane.showInputDialog(null, "Enter gratuityRate: ",
            "TipsterGuified Title", JOptionPane.QUESTION_MESSAGE);

        double tip = Double.parseDouble(gratuityRate);

        double gratuity = subtotal * (tip / 100);
        double total = subtotal + gratuity;

        System.out.println( "The tip is: " + gratuity + "Dollars");
        System.out.println( "Your total bill is: " + total + "Dollars");

    }
}