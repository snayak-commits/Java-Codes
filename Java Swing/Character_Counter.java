//program to count words and characters in a paragraph

import java.awt.event.*;
import javax.swing.*;

public class Character_Counter implements ActionListener
{
    JLabel label1, label2;
    JButton button;
    JTextArea area;
    
    Character_Counter()
    {
        JFrame frame = new JFrame("Character Counter");
        label1 = new JLabel();
        label1.setBounds(47, 25, 150, 30);
        label2 = new JLabel();
        label2.setBounds(130, 25, 150, 30);
        area = new JTextArea();
        area.setBounds(20, 75, 250, 200);
        button = new JButton("Count");
        button.setBounds(100, 300, 90, 30);
        button.addActionListener(this);

        frame.add(label1);
        frame.add(label2);
        frame.add(area);
        frame.add(button);
        frame.setSize(310, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        String text = area.getText();
        String word[] = text.split("\\s");
        label1.setText("Word(s): " + word.length);
        label2.setText("Character(s): " + text.length());
    }

    public static void main(String[] args)
    {
        new Character_Counter();
    }   
}