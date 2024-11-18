package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox1, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAadhar;
    JRadioButton buttonr1, buttonr2, buttonr3, buttonr4;
    JButton next;
    String formNumber;

    Signup2(String formNumber) {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(150, 5, 100, 100);
        add(image1);

        this.formNumber = formNumber;

        JLabel l1 = new JLabel("Page 2 :- ");
        l1.setFont(new Font("Relaway", Font.BOLD, 22));
        l1.setForeground(Color.WHITE);
        l1.setBounds(300, 30, 600, 40);
        add(l1);
        JLabel l2 = new JLabel("Additional details");
        l2.setFont(new Font("Relaway", Font.BOLD, 22));
        l2.setForeground(Color.WHITE);
        l2.setBounds(300, 60, 600, 40);
        add(l2);

        JLabel l3 = new JLabel("Religion : ");
        l3.setFont(new Font("Relaway", Font.BOLD, 18));
        l3.setForeground(Color.WHITE);
        l3.setBounds(100, 120, 100, 30);
        add(l3);
        String religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        // for Drop down we are using combo box
        comboBox1 = new JComboBox(religion);
        comboBox1.setBackground(Color.WHITE);
        comboBox1.setForeground(Color.BLACK);
        comboBox1.setFont(new Font("Relaway", Font.BOLD, 14));
        comboBox1.setBounds(350, 120, 320, 30);
        add(comboBox1);



        JLabel l4 = new JLabel("Region : ");
        l4.setFont(new Font("Relaway", Font.BOLD, 18));
        l4.setForeground(Color.WHITE);
        l4.setBounds(100, 170, 100, 30);
        add(l4);
        String category[] = {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(Color.WHITE);
        comboBox2.setForeground(Color.BLACK);
        comboBox2.setFont(new Font("Relaway", Font.BOLD, 14));
        comboBox2.setBounds(350, 170, 320, 30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Relaway", Font.BOLD, 18));
        l5.setForeground(Color.WHITE);
        l5.setBounds(100, 220, 100, 30);
        add(l5);
        String income[] = {"Null", "<1,50,000", "<2,50,000", "<5Lakh", "Upto 10Lakh", "Above 10Lakh"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(Color.WHITE);
        comboBox3.setForeground(Color.BLACK);
        comboBox3.setFont(new Font("Relaway", Font.BOLD, 14));
        comboBox3.setBounds(350, 220, 320, 30);
        add(comboBox3);

        JLabel l6 = new JLabel("Education : ");
        l6.setForeground(Color.WHITE);
        l6.setFont(new Font("Relaway", Font.BOLD, 18));
        l6.setBounds(100, 270, 150, 30);
        add(l6);
        String education[] = {"Non-graduate", "Graduate", "Post-graduate", "Doctorate", "Others"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(Color.WHITE);
        comboBox4.setForeground(Color.BLACK);
        comboBox4.setFont(new Font("Relaway", Font.BOLD, 14));
        comboBox4.setBounds(350, 270, 320, 30);
        add(comboBox4);

        // Occupation
        JLabel l7 = new JLabel("Occupation : ");
        l7.setForeground(Color.WHITE);
        l7.setFont(new Font("Relaway", Font.BOLD, 18));
        l7.setBounds(100, 320, 150, 30);
        add(l7);
        String occupation[] ={"Salaried", "Self-employed", "Business", "Student", "Retired", "Others"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(Color.WHITE);
        comboBox5.setForeground(Color.BLACK);
        comboBox5.setFont(new Font("Relaway", Font.BOLD, 14));
        comboBox5.setBounds(350, 320, 320, 30);
        add(comboBox5);

        // Pan no
        JLabel l8 = new JLabel("PAN number : ");
        l8.setFont(new Font("Relaway", Font.BOLD, 18));
        l8.setForeground(Color.WHITE);
        l8.setBounds(100, 370, 150, 30);
        add(l8);
        textPan = new JTextField();
        textPan.setFont(new Font("Relaway", Font.BOLD, 14));
        textPan.setBounds(350, 370, 320, 30);
        add(textPan);

        // Aadhar no
        JLabel l9 = new JLabel("Aadhar number : ");
        l9.setFont(new Font("Relaway", Font.BOLD, 18));
        l9.setForeground(Color.WHITE);
        l9.setBounds(100, 420, 180, 30);
        add(l9);
        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Relaway", Font.BOLD, 14));
        textAadhar.setBounds(350, 420, 320, 30);
        add(textAadhar);

        // Senior citizen
        JLabel l10 = new JLabel("Senior citizen : ");
        l10.setForeground(Color.WHITE);
        l10.setFont(new Font("Relaway", Font.BOLD, 18));
        l10.setBounds(100, 470, 180, 30);
        add(l10);
        buttonr1 = new JRadioButton("Yes");
        buttonr1.setFont(new Font("Relaway", Font.BOLD, 14));
        buttonr1.setForeground(Color.WHITE);
        buttonr1.setBackground(new Color(36, 36, 37));
        buttonr1.setBounds(350, 470, 100, 30);
        add(buttonr1);
        buttonr2 = new JRadioButton("No");
        buttonr2.setFont(new Font("Relaway", Font.BOLD, 14));
        buttonr2.setForeground(Color.WHITE);
        buttonr2.setBackground(new Color(36, 36, 37));
        buttonr2.setBounds(460, 470, 100, 30);
        add(buttonr2);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(buttonr1);
        buttonGroup.add(buttonr2);

        // Existing account
        JLabel l11 = new JLabel("Existing account : ");
        l11.setForeground(Color.WHITE);
        l11.setFont(new Font("Relaway", Font.BOLD, 18));
        l11.setBounds(100, 520, 180, 30);
        add(l11);
        buttonr3 = new JRadioButton("Yes");
        buttonr3.setFont(new Font("Relaway", Font.BOLD, 14));
        buttonr3.setForeground(Color.WHITE);
        buttonr3.setBackground(new Color(36, 36, 37));
        buttonr3.setBounds(350, 520, 100, 30);
        add(buttonr3);
        buttonr4 = new JRadioButton("No");
        buttonr4.setFont(new Font("Relaway", Font.BOLD, 14));
        buttonr4.setForeground(Color.WHITE);
        buttonr4.setBackground(new Color(36, 36, 37));
        buttonr4.setBounds(460, 520, 100, 30);
        add(buttonr4);

        JLabel l12 = new JLabel("Form no. : ");
        l12.setFont(new Font("Relaway", Font.BOLD, 14));
        l12.setForeground(Color.WHITE);
        l12.setBounds(690, 10, 80, 30);
        add(l12);

        JLabel l13 = new JLabel(formNumber);
        l13.setFont(new Font("Relaway", Font.BOLD, 18));
        l13.setForeground(Color.WHITE);
        l13.setBounds(760, 10, 60, 30);
        add(l13);

        // next
        next = new JButton("Submit");
        next.setFont(new Font("Relaway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570, 640, 100, 30);
        next.addActionListener(this);
        add(next);




        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(36, 36, 37));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Steps to send all the data, which are given by user
        // Convert all attribute into String
        String religion = (String) comboBox1.getSelectedItem();
        String category = (String) comboBox2.getSelectedItem();
        String income = (String) comboBox3.getSelectedItem();
        String education = (String) comboBox4.getSelectedItem();
        String occupation = (String) comboBox5.getSelectedItem();
        String panNo = textPan.getText();
        String aadhar = textAadhar.getText();

        String seniorCit = null;
        if(buttonr1.isSelected()){
            seniorCit = "Yes";
        } else if (buttonr2.isSelected()) {
            seniorCit = "No";
        }

        String existAcc = null;
        if(buttonr3.isSelected()) {
            existAcc = "Yes";
        } else if (buttonr3.isSelected()) {
            existAcc = "No";
        }

        try {
            if(textPan.getText().equals("") || textAadhar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields.");
            } else {
                Connect con = new Connect();
                String query = "insert into Signup2 values('"+formNumber+"', '"+religion+"', '"+category+"', '"+income+"', '"+education+"', '"+occupation+"', '"+panNo+"', '"+aadhar+"', '"+seniorCit+"', '"+existAcc+"')";
                // When we are inserting values into table, we are using statement.executeUpdate(query) via query
                con.statement.executeUpdate(query);
                new Signup3(formNumber);
                setVisible(false);
            }
        } catch(Exception E) {
            E.printStackTrace();
        }



    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
