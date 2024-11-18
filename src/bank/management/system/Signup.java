package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JTextField textName, textFatherName, textEmail, textAddress, textCity, textPin, textState;
    JDateChooser dateChooser;
    JRadioButton button1, button2, button3, button4;
    JButton nextButton;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);


    Signup() {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(25, 10, 100, 100);
        add(image1);

        JLabel label1 = new JLabel("Application form number." + first);
        label1.setBounds(130, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(400, 70, 600, 30);
        add(label2);

        // personal details
        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(340, 100, 600, 30);
        add(label3);

        // Name
        JLabel labelName = new JLabel("Name : ");
        labelName.setFont(new Font("Raleway", Font.BOLD, 22));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);
        // textName
        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        // Father's name
        JLabel labelFatherName = new JLabel("Father's Name : ");
        labelFatherName.setFont(new Font("Raleway", Font.BOLD, 22));
        labelFatherName.setBounds(100, 240, 200, 30);
        add(labelFatherName);
        //textFatherName
        textFatherName = new JTextField();
        textFatherName.setFont(new Font("Raleway", Font.BOLD, 14));
        textFatherName.setBounds(300, 240, 400, 30);
        add(textFatherName);

        // DOB
        JLabel DOB = new JLabel("Date of Birth : ");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 340, 200, 30);
        add(DOB);

        // calendar
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);
        // Gender
        JLabel labelGender = new JLabel("Gender : ");
        labelGender.setFont(new Font("Raleway", Font.BOLD, 20));
        labelGender.setBounds(100, 290, 200, 30);
        add(labelGender);
        // Gender btn
        button1 = new JRadioButton("Male");
        button1.setFont(new Font("Raleway", Font.BOLD, 14));
        button1.setBackground(new Color(222, 255, 228));
        button1.setBounds(300, 290, 60, 30);
        add(button1);
        button2 = new JRadioButton("Female");
        button2.setFont(new Font("Raleway", Font.BOLD, 14));
        button2.setBackground(new Color(222, 255, 228));
        button2.setBounds(450, 290, 90, 30);
        add(button2);
        // btn group is used to check one btn at a time Only check form selected btn
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(button1);
        buttonGroup.add(button2);

        // email
        JLabel labelEmail = new JLabel("Email address: ");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);
        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        // Marital status
        JLabel labelMarital = new JLabel("Marital Status : ");
        labelMarital.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMarital.setBounds(100, 440, 200, 30);
        add(labelMarital);
        // Gender btn
        button3 = new JRadioButton("Married");
        button3.setFont(new Font("Raleway", Font.BOLD, 14));
        button3.setBackground(new Color(222, 255, 228));
        button3.setBounds(300, 440, 100, 30);
        add(button3);
        button4 = new JRadioButton("Unmarried");
        button4.setFont(new Font("Raleway", Font.BOLD, 14));
        button4.setBackground(new Color(222, 255, 228));
        button4.setBounds(450, 440, 100, 30);
        add(button4);

        // Address
        JLabel labelAddress = new JLabel("Address : ");
        labelAddress.setFont(new Font("Relaway", Font.BOLD, 20));
        labelAddress.setBounds(100, 490, 200, 30);
        add(labelAddress);
        textAddress = new JTextField();
        textAddress.setFont(new Font("Relaway", Font.BOLD, 14));
        textAddress.setBounds(300, 490, 400, 30);
        add(textAddress);

        // city
        JLabel labelCity = new JLabel("City : ");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100, 540, 200, 30);
        add(labelCity);
        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 540, 400, 30);
        add(textCity);

        // pin
        JLabel labelPin = new JLabel("Pin Code : ");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setBounds(100, 590, 200, 30);
        add(labelPin);
        textPin = new JTextField();
        textPin.setFont(new Font("Relaway", Font.BOLD, 14));
        textPin.setBounds(300, 590, 400, 30);
        add(textPin);

        // state
        JLabel labelState = new JLabel("State : ");
        labelState.setFont(new Font("Relaway", Font.BOLD, 20));
        labelState.setBounds(100, 640, 200, 30);
        add(labelState);
        textState = new JTextField();
        textState.setFont(new Font("Relaway", Font.BOLD, 14));
        textState.setBounds(300, 640, 400, 30);
        add(textState);

        // nextButton
        nextButton = new JButton("Next");
        nextButton.setFont(new Font("Relaway", Font.BOLD, 14));
        nextButton.setBackground(Color.BLACK);
        nextButton.setForeground(Color.WHITE);
        nextButton.setBounds(620, 710, 80, 30);
        nextButton.addActionListener(this);
        add(nextButton);


        getContentPane().setBackground(new Color(222, 255,228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);

        }

    @Override
    public void actionPerformed(ActionEvent e) {
        // These info. are attributes, which are stored in mysql database table.
        String formNo = first;
        String name = textName.getText();
        String fatherName = textFatherName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(button1.isSelected()) {
            gender = "Male";
        } else if (button2.isSelected()){
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(button3.isSelected()) {
            marital = "Married";
        } else if(button4.isSelected()) {
            marital = "Unmarried";
        }
        String address = textAddress.getText();
        String city = textCity.getText();
        String pinCode = textPin.getText();
        String state = textState.getText();

        // stored in table
        try {
            if(textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields.");
            } else {
                Connect con = new Connect();
                // query for store in database
                String query = "insert into signup values('"+formNo+"', '"+name+"', '"+fatherName+"',   '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pinCode+"', '"+state+"')";
                con.statement.executeUpdate(query); // executeUpdate fun is used to insert the values into table, via query.
                new Signup2(first);
                // After the value insertion is completed then, close this current signup window by using setVisible(false) and redirect into signup2 page
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }


    }
    public static void main(String[] args) {
        new Signup();
    }
}
