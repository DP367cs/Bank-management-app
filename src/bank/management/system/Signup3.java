package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton buttonr1, buttonr2, buttonr3, buttonr4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    String formNumber;
    JButton submit, clear;
    String formNo;
    Signup3(String formNo) {
        this.formNo = formNo;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(150, 5, 100, 100);
        add(image1);


        this.formNumber = formNumber;

        JLabel l1 = new JLabel("Page 3 :- ");
        l1.setFont(new Font("Relaway", Font.BOLD, 22));
        l1.setForeground(Color.BLACK);
        l1.setBounds(300, 30, 600, 40);
        add(l1);
        JLabel l2 = new JLabel("Additional details");
        l2.setFont(new Font("Relaway", Font.BOLD, 22));
        l2.setForeground(Color.BLACK);
        l2.setBounds(300, 60, 600, 40);
        add(l2);


        JLabel l3 = new JLabel("Account type : ");
        l3.setFont(new Font("Relaway", Font.BOLD, 18));
        l3.setBounds(100, 150, 150, 30);
        l3.setForeground(Color.BLACK);
        add(l3);
        buttonr1 = new JRadioButton("Saving Account");
        buttonr1.setFont(new Font("Relaway", Font.BOLD, 14));
        buttonr1.setBounds(300, 150, 180, 30);
        buttonr1.setBackground(new Color(217, 217, 217));
        buttonr1.setForeground(Color.BLACK);
        add(buttonr1);
        buttonr2 = new JRadioButton("Current Account");
        buttonr2.setFont(new Font("Relaway", Font.BOLD, 14));
        buttonr2.setBounds(500, 150, 180, 30);
        buttonr2.setBackground(new Color(217, 217, 217));
        buttonr2.setForeground(Color.BLACK);
        add(buttonr2);
        buttonr3 = new JRadioButton("Fixed Deposit Account");
        buttonr3.setFont(new Font("Relaway", Font.BOLD, 14));
        buttonr3.setBounds(300, 180, 190, 30);
        buttonr3.setBackground(new Color(217, 217, 217));
        buttonr3.setForeground(Color.BLACK);
        add(buttonr3);
        buttonr4 = new JRadioButton("Recurring Deposit Account");
        buttonr4.setFont(new Font("Relaway", Font.BOLD, 14));
        buttonr4.setBounds(500, 180, 230, 30);
        buttonr4.setBackground(new Color(217, 217, 217));
        buttonr4.setForeground(Color.BLACK);
        add(buttonr4);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(buttonr1);
        buttonGroup.add(buttonr2);
        buttonGroup.add(buttonr3);
        buttonGroup.add(buttonr4);

        // Card no
        JLabel l4 = new JLabel("Card number : ");
        l4.setFont(new Font("Relaway", Font.BOLD, 18));
        l4.setBounds(100, 250, 200, 30);
        add(l4);
        JLabel l5 = new JLabel("(Your 16-digit card number)");
        l5.setFont(new Font("Relaway", Font.BOLD, 12));
        l5.setBounds(100, 270, 200, 30);
        add(l5);
        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Relaway", Font.BOLD, 18));
        l6.setBounds(330, 250, 250, 30);
        add(l6);
        JLabel l7 = new JLabel("(It would appear on ATM card/cheque Book and Statement)");
        l7.setFont(new Font("Relaway", Font.BOLD, 12));
        l7.setBounds(330, 270, 500, 30);
        add(l7);
        JLabel l8 = new JLabel("PIN : ");
        l8.setFont(new Font("Relaway", Font.BOLD, 18));
        l8.setBounds(100, 320, 200, 30);
        add(l8);
        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Relaway", Font.BOLD, 18));
        l9.setBounds(330, 320, 200, 30);
        add(l9);
        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Relaway", Font.BOLD, 12));
        l10.setBounds(100, 350, 200, 20);
        add(l10);
        JLabel l11 = new JLabel("Services Required : ");
        l11.setFont(new Font("Relaway", Font.BOLD, 18));
        l11.setBounds(100, 400, 200, 30);
        add(l11);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(new Color(217, 217, 217));
        c1.setFont(new Font("Relaway", Font.BOLD, 14));
        c1.setBounds(300, 400, 200, 30);
        add(c1);
        c3 = new JCheckBox("Cheque Book");
        c3.setBackground(new Color(217, 217, 217));
        c3.setFont(new Font("Relaway", Font.BOLD, 14));
        c3.setBounds(300, 430, 200, 30);
        add(c3);
        c2 = new JCheckBox("Net Banking");
        c2.setBackground(new Color(217, 217, 217));
        c2.setFont(new Font("E-mail Alerts", Font.BOLD, 14));
        c2.setBounds(500, 400, 200, 30);
        add(c2);
        c4 = new JCheckBox("E-Statement");
        c4.setBackground(new Color(217, 217, 217));
        c4.setFont(new Font("Relaway", Font.BOLD, 14));
        c4.setBounds(500, 430, 200, 30);
        add(c4);
        c5 = new JCheckBox("E-mail Alerts");
        c5.setBackground(new Color(217, 217, 217));
        c5.setFont(new Font("Relaway", Font.BOLD, 14));
        c5.setBounds(300, 460, 200, 30);
        add(c5);
        c6 = new JCheckBox("Mobile Banking");
        c6.setBackground(new Color(217, 217, 217));
        c6.setFont(new Font("Relaway", Font.BOLD, 14));
        c6.setBounds(500, 460, 200, 30);
        add(c6);
        c7 = new JCheckBox("I am here by declares that the above entered details correct to the best of my knowledge.");
        c7.setBackground(new Color(217, 217, 217));
        c7.setFont(new Font("Relaway", Font.BOLD, 12));
        c7.setBounds(100, 550, 600, 20);
        add(c7);

        JLabel l13 = new JLabel(formNumber);
        l13.setFont(new Font("Relaway", Font.BOLD, 12));
        l13.setBounds(760, 10, 60, 30);
        add(l13);

        submit = new JButton("Submit");
        submit.setFont(new Font("Relaway", Font.BOLD, 14));
        submit.setBackground(new Color(21, 21, 23));
        submit.setForeground(Color.WHITE);
        submit.setBounds(300, 620, 100, 30);
        submit.addActionListener(this);
        add(submit);
        clear = new JButton("Cancel");
        clear.setFont(new Font("Relaway", Font.BOLD, 14));
        clear.setBackground(new Color(21, 21, 23));
        clear.setForeground(Color.WHITE);
        clear.setBounds(460, 620, 100, 30);
        clear.addActionListener(this);
        add(clear);

        JLabel l14 = new JLabel("Form no. ");
        l14.setFont(new Font("Relaway", Font.BOLD, 14));
        l14.setBounds(700, 10, 100, 30);
        add(l14);


        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(217, 217, 217));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accType = null;
        if (buttonr1.isSelected()) {
            accType = "Saving Account";
        } else if (buttonr2.isSelected()) {
            accType = "Current Account";
        } else if(buttonr3.isSelected()) {
            accType = "Fixed Deposit Account";
        } else if (buttonr4.isSelected()) {
            accType = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        // pin generate
        String cardNo = "" + Math.abs(first7);
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pinNo = "" + Math.abs(first3);
        String service = "";
        if(c1.isSelected()) {
            service += "ATM Card";
        } else if(c2.isSelected()) {
            service += "Cheque Book";
        } else if (c3.isSelected()) {
            service += "Net Banking";
        } else if (c4.isSelected()) {
            service += "E-Statement";
        } else if (c5.isSelected()) {
            service += "E-mail Alerts";
        } else if (c6.isSelected()) {
            service += "Mobile Banking";
        }

        try {
            if (e.getSource() == submit) {
                if(accType.equals("")) {
                    new Deposit(pinNo);
                    JOptionPane.showMessageDialog(null, "Fill all the fields.");
                } else {
                    Connect con = new Connect();
                    String query1 = "insert into signup3 values('"+formNo+"', '"+accType+"', '"+cardNo+"', '"+pinNo+"', '"+service+"')";
                    String query2 = "insert into login values ('"+formNo+"', '"+cardNo+"', '"+pinNo+"')";
                    con.statement.executeUpdate(query1);
                    con.statement.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card Number : " + cardNo + "\n Pin Number : " + pinNo);
                    setVisible(false);
                    new Login();
                }
            } else if (e.getSource() == clear) {
                System.exit(0);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
