package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1, button2, button3;

    Login() {
    // key point: If you want to see any image in window then you should set and lable the image before setVisibility(true), otherwise you can't see the image
        // set the window name
        super("Bank management system");

        // Image 1 insertion

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        // we can't get image directly on frame, we can see the image bby using label
        JLabel image1 = new JLabel(i3);
        image1.setBounds(350, 10, 100, 100);
        // image add
        add(image1); // jlable wala image

        // Image 2 insertion

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel image2 = new JLabel(ii3);
        image2.setBounds(630, 350, 100, 100);
        add(image2);

        // insert title etc inside window

        // welcome label
        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade", Font.BOLD, 38));
        label1.setBounds(230, 125, 450,40);
        add(label1);

        // card label
        label2 = new JLabel("Card No: ");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150, 190, 375, 30);
        add(label2);
        // textField
        textField2 = new JTextField(15);
        textField2.setBounds(325, 190, 230, 30);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField2);

        // Pin label
        label3 = new JLabel("Pin : ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setBounds(150, 250, 375, 30);
        add(label3);
        // passwordField
        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325, 250, 230, 30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField3);

        button1 = new JButton("Sign in");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300, 300, 100, 30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("Clear");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430, 300, 100, 30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("Sign up");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300, 350, 230, 30);
        button3.addActionListener(this);
        add(button3);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel image3 = new JLabel(iii3);
        image3.setBounds(0, 0, 850, 480);
        add(image3);



        setLayout(null);
        // set the frame
        setSize(850, 480);
        // open the window in center of screen
//        setUndecorated(true);
        setLocation(450, 200);
        // By default frame visibility is hidden
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent event) {
    // Here event variable stores the action of a button and then compare it to all button, which button was click, acc to that it performs the operation
        try {
            if (event.getSource() == button1) {
                Connect con = new Connect();
                String cardNo = textField2.getText();
                String pin = passwordField3.getText();
                // check user input value is true or not if not, then send a msg, Enter correct credential
                String query = "select * from login where card_number = '"+cardNo+"' and pin = '"+pin+"'";
                // here we are getting the pin from database
                ResultSet resultSet = con.statement.executeQuery(query);
                if(resultSet.next()) {
                    setVisible(false);
                    new main_class(pin);
                } else {
               // check user input value is true or not if not, then send a msg, Enter correct credential
                    JOptionPane.showMessageDialog(null, "Incorrect card number");
                }
            }
            else if (event.getSource() == button2) {
                textField2.setText("");
                passwordField3.setText("");
            }
            else if (event.getSource() == button3) {
                new Signup();
                setVisible(false);
            }
            else {

            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
