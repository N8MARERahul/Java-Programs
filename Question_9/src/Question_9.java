import java.sql.*;
import java.util.Scanner;

public class Question_9 {
    private static Connection connection = null;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Question_9 jdbc = new Question_9();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Show global variables like 'PORT';
            String url = "jdbc:mysql://localhost/jdbc";
            String username = "root";
            String password = "";
            connection = DriverManager.getConnection(url, username, password);

            System.out.println("1. Insert record");
            System.out.println("2. Display record");
            System.out.println("Enter Choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    jdbc.InsertRecord();
                    break;
                case 2:
                    jdbc.SelectRecord();
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("Something wents Wrong!!");
        }
    }

    private void InsertRecord() throws SQLException {

        String sql = "insert into student_info(regno, sname, city, contactno) values(?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        System.out.println("Enter Registration number: ");
        preparedStatement.setInt(1, scanner.nextInt());
        System.out.println("Enter Student's Name: ");
        preparedStatement.setString(2, scanner.nextLine());
        System.out.println("Enter City: ");
        preparedStatement.setString(3, scanner.nextLine());
        System.out.println("Enter Phone Number: ");
        preparedStatement.setInt(4, scanner.nextInt());

        int rows = preparedStatement.executeUpdate();

        if (rows > 0)
            System.out.println("Insertion Successful");
    }

    public void SelectRecord() throws SQLException {

        String sql = "select * from student_info";
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int regno = resultSet.getInt("regno");
            String sname = resultSet.getString("sname");
            String city = resultSet.getString("city");
            int contactno = resultSet.getInt("contactno");

            System.out.println("Registration no is: " + regno);
            System.out.println("Name is: " + sname);
            System.out.println("City is: " + city);
            System.out.println("Contact No: " + contactno);
        }
    }
}
