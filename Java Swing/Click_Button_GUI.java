//program to create a interactive click button

import javax.swing.JButton;
import javax.swing.JFrame;

public class Click_Button_GUI 
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Click");
        JButton b = new JButton("Click Here!");
        b.setBounds(140, 110, 110, 50);
        f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}