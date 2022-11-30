import java.sql.*;
import java.util.Scanner;

public class Database1 {
	private static Connection connection = null;
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Database1 database1 = new Database1();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//show global variables like 'PORT';
			String url = "jdbc:mysql://localhost/jdbc";
			String userName = "root";
			String password = "";
			connection = DriverManager.getConnection(url, userName, password);
			
			System.out.println("1: Insert record");
			System.out.println("2: Display record");
			System.out.println("Enter Choice: ");
			
			int choice = Integer.parseInt(scanner.nextLine());
			
			switch (choice) {
				case 1:
					database1.insertRecord();
					break;
					
				case 2:
					database1.selectRecord();
					break;
					
				default:
					break;
			}
		} catch (Exception e) {
			throw new RuntimeException("Somethigns wents Wrong");
		}
	}
	
	private void insertRecord() throws SQLException{
		
		String sql = "insert into c_details(CID, C_NAME, C_ADDRESS, C_AGE, C_COUNTRY, P_NO, C_EMAIL) values(?, ?, ?, ?, ?, ?, ?)";
				
		PreparedStatement preparedstatment = connection.prepareStatement(sql);
		
//		System.out.println("Enter ID: ");
//		preparedstatment.setString(1, scanner.nextLine());
		preparedstatment.setString(1, "124598");
		preparedstatment.setString(2, "Raj Kumar");
		preparedstatment.setString(3, "1/2 K J lane");
		preparedstatment.setString(4, "26");
		preparedstatment.setString(5, "India");
		preparedstatment.setString(6, "12");
		preparedstatment.setString(7, "Raj@gmail.com");
		
		int rows = preparedstatment.executeUpdate();
		
		if (rows > 0) {
			System.out.println("Insertion Successful");
		}
	}
	
	public void selectRecord() throws SQLException {
		
		String sql = "select * from c_details";
		Statement statement = connection.createStatement();
		
		ResultSet resultset = statement.executeQuery(sql);
		
		while (resultset.next()) {
			String cid = resultset.getString("CID");
			String name = resultset.getString("C_NAME");
			System.out.println("CID is: " + cid);
			System.out.println("Name is: " + name);
		}
		
	}

}