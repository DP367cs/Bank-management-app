package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {
    String pin;
    JTextField textField;
    JButton button1, button2;
    Withdrawal(String pin) {
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

        JLabel l2 = new JLabel("Please enter your amount :");
        l2.setFont(new Font("Relaway", Font.BOLD, 20));
        l2.setForeground(Color.BLACK);
        l2.setBounds(160, 170, 400, 35);
        l1.add(l2);

        JLabel l3 = new JLabel("(Maximum withdrawal amount is Rs10,000)");
        l3.setFont(new Font("Relaway", Font.BOLD, 12));
        l3.setForeground(Color.BLACK);
        l3.setBounds(160, 200, 400, 35);
        l1.add(l3);

        textField = new JTextField();
        textField.setBounds(200, 250, 230, 40);
        textField.setBackground(new Color(77, 77, 78));
        textField.setForeground(Color.WHITE);
        textField.setFont(new Font("Relaway", Font.BOLD, 22));
        l1.add(textField);

        button1 = new JButton("Withdrawal");
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
            if (textField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your amount you want to withdrawal.");
            } else {
                Connect con = new Connect();
                ResultSet resultSet = con.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while (resultSet.next()) {
                    // If it is deposit then += amount otherwise -= amount
                    if (resultSet.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                if (balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient balance");
                    return;
                }
                con.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdrawal', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited successfully");
                setVisible(false);
                new main_class(pin);
            }
            if (e.getSource() == button2) {
                setVisible(false);
                new main_class(pin);
            }
            // If we get any data from DB then we will use executeQuery
            // If set any data into DB then we will use updateExecuteQuery
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Withdrawal("");
    }
}
