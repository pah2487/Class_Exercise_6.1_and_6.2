import javax.swing.*;
import java.awt.*;
/**
 * Swing class that finds the sum of two given numbers from two input fields
 * @author Patrick H.
 * @since 2017-11-27
 * @version 1.0
 */
public abstract class CalcGUI{
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel label;
    private static JLabel output;
    private static JTextField textField1;
    private static JTextField textField2;
    private static JButton button;
    public static void main(String[] args){
        frame = new JFrame();
        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.CYAN);

        label = new JLabel();
        label.setText("Enter Numbers:");
        output = new JLabel();
        output.setText("------");

        textField1 = new JTextField(5);
        textField2 = new JTextField(5);

        button = new JButton("Sum!");
        button.addActionListener(e ->{
            output.setText(Double.toString(Double.parseDouble(textField1.getText()) + Double.parseDouble(textField2.getText())));
        });

        panel.add(label);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(button);
        panel.add(output);
        frame.add(panel);
        frame.setVisible(true);
    }
}
