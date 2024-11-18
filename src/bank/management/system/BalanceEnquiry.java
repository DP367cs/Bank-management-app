package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    JButton button1, button2;
    JLabel l3;
    String pin;
    BalanceEnquiry(String pin) {
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

        JLabel l2 = new JLabel("Your current balance is Rs. ");
        l2.setFont(new Font("Relaway", Font.BOLD, 20));
        l2.setForeground(Color.BLACK);
        l2.setBounds(160, 170, 400, 35);
        l1.add(l2);

        l3 = new JLabel();
        l3.setFont(new Font("Relaway", Font.BOLD, 12));
        l3.setForeground(Color.BLACK);
        l3.setBounds(160, 200, 400, 35);
        l1.add(l3);

        button2 = new JButton("Back");
        button2.setFont(new Font("Relaway", Font.BOLD, 14));
        button2.setBounds(335, 400, 160,27);
        button2.setBackground(new Color(101, 1, 1));
        button2.setForeground(Color.WHITE);
        button2.addActionListener(this);
        l1.add(button2);


        int balance = 0;
        try {
            Connect con = new Connect();
            ResultSet resultSet = con.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (resultSet.next()) { // get data from resultSet by .next(), data actually store in resultSet variable
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        } catch (Exception E) {
            E.printStackTrace();
        }

        l3.setText("" + balance);



        setSize(783, 741);
        setLocation(450, 80);
        setVisible(true);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button2) {
            setVisible(false);
            new main_class(pin);
        }
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
