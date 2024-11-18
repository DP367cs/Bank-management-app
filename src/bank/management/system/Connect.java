package bank.management.system;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

// Connection of signup page to mysql database table

public class Connect {
    Connection connection;
    Statement statement;
    public Connect() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "root");
            statement = connection.createStatement();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
