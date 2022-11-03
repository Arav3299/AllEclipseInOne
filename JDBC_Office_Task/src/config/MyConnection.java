package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	public static Connection getConnection() throws ClassNotFoundException {

		Connection connection = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/office_project?characterEncoding=utf8";
			String username = "root";
			String password = "arav";

			connection = DriverManager.getConnection(url, username, password);
			return connection;

		} catch (SQLException ex) {

			System.out.println(ex.getMessage());

			return null;
		}

	}
}
