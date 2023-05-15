//program to create a simple GUI Calculator

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator_2 implements ActionListener
{
    JTextField text1, text2, text3;
    JButton button1, button2, button3, button4, button5, button6, button7;

    Calculator_2()
    {
        JFrame frame = new JFrame("Calculator");
        text1 = new JTextField();
        text1.setBounds(100, 50, 120, 20);
        text2 = new JTextField();
        text2.setBounds(100, 100, 120, 20);
        text3 = new JTextField();
        text3.setBounds(100, 150, 120, 20);
        text3.setEditable(false);
        button1 = new JButton("+");
        button1.setBounds(50, 200, 50, 50);
        button2 = new JButton("-");
        button2.setBounds(110, 200, 50, 50);
        button3 = new JButton("*");
        button3.setBounds(170, 200, 50, 50);
        button4 = new JButton("/");
        button4.setBounds(230, 200, 50, 50);
        button5 = new JButton("%");
        button5.setBounds(50, 260, 50, 50);
        button6 = new JButton("xʸ");
        button6.setBounds(110, 260, 50, 50);
        button7 =new JButton("Clear");
        button7.setBounds(170, 260, 110, 50);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);

        frame.add(text1);
        frame.add(text2);
        frame.add(text3);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);

        frame.setSize(350, 400);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        String str1 = text1.getText();
        String str2 = text2.getText();
        float a = Integer.parseInt(str1);
        float b = Integer.parseInt(str2);
        float c = 0;

        if(e.getSource() == button1)
        {
            c = a + b;
        }
        else if(e.getSource() == button2)
        {
            c = a - b;
        }
        else if(e.getSource() == button3)
        {
            c = a * b;
        }
        else if(e.getSource() == button4)
        {
            c = a / b;
        }
        else if(e.getSource() == button5)
        {
            c = a % b;
        }
        else if(e.getSource() == button6)
        {
            c = (float) Math.pow(a, b);
        }
        else if(e.getSource() == button7)
        {
            text1.setText(null);
            text2.setText(null);
            text3.setText(null);
        }

        String result = String.valueOf(c);
        text3.setText(result);
    }

    public static void main(String[] args)
    {
        new Calculator_2();        
    }
}