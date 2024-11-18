package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.*;

public class Deposit extends JFrame implements ActionListener {

    String pin;
    JTextField textField;
    JButton button1, button2;
    Deposit(String pin) {
        this.pin = pin;
        // load the img from device into ImageIcon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm_img.png"));
        // Scale the imageIcon into Image
        Image i2 = i1.getImage().getScaledInstance(783, 741, Image.SCALE_DEFAULT);
        // Wrap Image i2 with ImageIcon
        ImageIcon i3 = new ImageIcon(i2);
        // Set a label for Wrapped image to show acc. to setBound prop.
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,600, 600);
        add(l1);

        JLabel l2 = new JLabel("Enter amount you want to deposit : ");
        l2.setFont(new Font("Relaway", Font.BOLD, 20));
        l2.setForeground(Color.BLACK);
        l2.setBounds(160, 170, 400, 35);
        l1.add(l2);

        textField = new JTextField();
        textField.setBounds(200, 220, 230, 40);
        textField.setBackground(new Color(77, 77, 78));
        textField.setForeground(Color.WHITE);
        textField.setFont(new Font("Relaway", Font.BOLD, 22));
        l1.add(textField);

        button1 = new JButton("Deposit");
        button1.setFont(new Font("Relaway", Font.BOLD, 14));
        button1.setBounds(335, 370, 160, 27);
        button1.setBackground(new Color(11, 112, 14));
        button1.setForeground(Color.WHITE);
        button1.addActionListener(this);
        l1.add(button1);


        button2 = new JButton("Back");
        button2.setFont(new Font("Relaway", Font.BOLD, 14));
        button2.setBounds(335, 400, 160,27);
        button2.setBackground(new Color(101, 1, 1));
        button2.setForeground(Color.WHITE);
        button2.addActionListener(this);
        l1.add(button2);





        setSize(783, 741);
        setLocation(450, 80);
        setVisible(true);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            String amount = textField.getText();
            Date date = new Date();
            if(e.getSource() == button1) {
                if(textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount.");
                } else {
                    Connect con = new Connect();
                    con.statement.executeUpdate("insert into bank values ('"+pin+"', '"+date+"', 'Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs " + amount + " Deposited Successfully");
                    setVisible(false);
                    new main_class(pin);
                }
            } else if (e.getSource() == button2) {
                setVisible(false);
                new main_class(pin);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
