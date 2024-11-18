package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {

    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
    String pin;
    main_class(String pin) {

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm_img.png"));
        // Scale the imageIcon into Image
        Image i2 = i1.getImage().getScaledInstance(783, 741, Image.SCALE_DEFAULT);
        // Wrap Image i2 with ImageIcon
        ImageIcon i3 = new ImageIcon(i2);
        // Set a label for Wrapped image to show acc. to setBound prop.
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,600, 600);
        add(l1);

        //
        JLabel l2 = new JLabel("Please select your transaction : ");
        l2.setFont(new Font("Relaway", Font.BOLD, 18));
        l2.setForeground(Color.BLACK);
        l2.setBounds(160, 170, 400, 35);
        l1.add(l2);

        // DEPOSIT
        button1 = new JButton("Balance enquiry");
        button1.setFont(new Font("Relaway", Font.BOLD, 14));
        button1.setBounds(130, 366, 160, 27);
        button1.setBackground(new Color(19, 25, 189));
        button1.setForeground(Color.WHITE);
        button1.addActionListener(this);
        l1.add(button1);

        button2 = new JButton("Exit");
        button2.setFont(new Font("Relaway", Font.BOLD, 14));
        button2.setBounds(335, 397, 160,27);
        button2.setBackground(new Color(101, 1, 1));
        button2.setForeground(Color.WHITE);
        button2.addActionListener(this);
        l1.add(button2);


//        button8 = new JButton("Mini statement");
//        button8.setFont(new Font("Relaway", Font.BOLD, 14));
//        button8.setBounds(130, 397, 160,27);
//        button8.setBackground(new Color(19, 25, 189));
//        button8.setForeground(Color.WHITE);
//        button8.addActionListener(this);
//        l1.add(button8);

//        button3 = new JButton("Deposit5");
//        button3.setFont(new Font("Relaway", Font.BOLD, 14));
//        button3.setBounds(130, 398, 160,27);
//        button3.setBackground(new Color(19, 25, 189));
//        button3.setForeground(Color.WHITE);
////        button3.addActionListener(this);
//        l1.add(button3);

        button4 = new JButton("Deposit");
        button4.setFont(new Font("Relaway", Font.BOLD, 14));
        button4.setBounds(130, 305, 160,27);
        button4.setBackground(new Color(19, 25, 189));
        button4.setForeground(Color.WHITE);
        button4.addActionListener(this);
        l1.add(button4);

        button5 = new JButton("Cash withdrawal");
        button5.setFont(new Font("Relaway", Font.BOLD, 14));
        button5.setBounds(130, 335, 160,27);
        button5.setBackground(new Color(19, 25, 189));
        button5.setForeground(Color.WHITE);
        button5.addActionListener(this);
        l1.add(button5);

        setSize(783, 741);
        setLocation(450, 80);
        setVisible(true);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button4) {
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource() == button2) {
            System.exit(0);
        } else if (e.getSource() == button5) {
            new Withdrawal(pin);
            setVisible(false);
        } else if (e.getSource() == button1) {
            new BalanceEnquiry(pin);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new main_class("");
    }
}
