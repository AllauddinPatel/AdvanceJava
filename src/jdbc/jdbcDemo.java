package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registering driver

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java28sept","Allu","Pass@123");

            Statement statement=connection.createStatement();
            String insert = "insert into employee(id,name,address) value(1,'Allauddin','Pune')";

            String delete="delete from employee where id=2";

            String update="update employee set name='Allu' where id=1";
            int i=statement.executeUpdate(update);

            System.out.println("Row Affected =>"+i);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
