//program to create an IP Finder

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class IP_Finder extends Frame implements ActionListener
{
    JTextField text;
    JLabel label;
    JButton button;

    IP_Finder()
    {
        setTitle("IP Finder");
        text = new JTextField();
        text.setBounds(100, 100, 200, 20);
        label = new JLabel();
        label.setBounds(20, 100, 500, 250);
        button = new JButton("Find IP");
        button.setBounds(150, 150, 90, 30);
        button.addActionListener(this);
        
        add(button);
        add(text);
        add(label);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        try
        {
            String host = text.getText();
            String IP = java.net.InetAddress.getByName(host).getHostAddress();
            label.setText("IP Address of " + host + " is " + IP);      
        }
        catch(Exception ex)
        {
            System.out.print(ex);
        }
    }

    public static void main(String[] args)
    {
        new IP_Finder();
    }
}