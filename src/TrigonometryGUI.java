/*
* TrigonometryGUI.java
* last edited 05 30 23 by Zack A
* Program that asks the user for an angle in
* degrees, then displays sine, cosine, and tangent
* of the angle
*/

// import the packages
import javax.swing.*;
import java.awt.event.*;

// create the frame using the JFrame function named TrigonometryGUI
public class TrigonometryGUI
{
    public static void main(String[] args)
    {
        TextFieldFrame myFrame = new TextFieldFrame();

        myFrame.setTitle("Trigonometry GUI");
        myFrame.setSize(256, 256);
        myFrame.setLocation(200, 300);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    } // end main()
} // end class TrigonometryGUI

// create a subclass of JFrames named TextFieldFrame
class TextFieldFrame extends JFrame implements ActionListener
{
    JLabel prompt = new JLabel("Enter an angle in degrees");
    JTextField jtfAngle = new JTextField(10);

    JLabel sineText = new JLabel("Sine:");
    JLabel cosText = new JLabel("Cosine:");
    JLabel tanText = new JLabel("Tangent:");
    JLabel sineLabel = new JLabel("-");
    JLabel cosLabel = new JLabel("-");
    JLabel tanLabel = new JLabel("-");

    // a detailed constructor for TextFieldFrame objects
    public TextFieldFrame()
    {
        // give the TextFieldFrame a BoxLayout
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // add  the components to TextFieldFrame
        add(prompt);
        add(jtfAngle);
        add(sineText);
        add(sineLabel);
        add(cosText);
        add(cosLabel);
        add(tanText);
        add(tanLabel);

        // register TextFieldFrame (this method) as the listener for jtfAngle
        jtfAngle.addActionListener(this);

    } // end TextFieldFrame() constructor


    public void actionPerformed(ActionEvent e)
    {
        // capture the angle from the text field as a double
        double angle = Double.parseDouble(jtfAngle.getText());
        // convert the angle double to a radian using the Math.toRadians() function
        double radians = Math.toRadians(angle);
        // determine the sine, cosine, and tangent of the radians using the Math functions
        // in java.
        sineLabel.setText(Double.toString(Math.sin(radians)));
        cosLabel.setText(Double.toString(Math.cos(radians)));
        tanLabel.setText(Double.toString(Math.tan(radians)));

    } // end actionPerformed(ActionEvent e)
} // end class TextFieldFrame

