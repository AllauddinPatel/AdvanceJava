package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registering driver
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java28sept","Allu","Pass@123");

            Scanner scanner = new Scanner(System.in);
            int id;
            String name;
            String address;

            System.out.println("Enter your id");
            id=scanner.nextInt();
            System.out.println("Enter Name");
            name=scanner.next();
            System.out.println("Enter address");
            address=scanner.next();

            String insert="insert into employee(id,name,address)values(?,?,?)";
            PreparedStatement preparedStatement= connection.prepareStatement(insert);

            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,address);

            int i= preparedStatement.executeUpdate();
            System.out.println("Row Inserted="+i);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }
}
