import java.sql.*;

public class Database {
	private static Connection connection = null;
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//show global variables like 'PORT';
			String url = "jdbc:mysql://localhost/";
			String userName = "root";
			String password = "";
			connection = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			throw new RuntimeException("Somethigns wents Wrong");
		}
	}

}