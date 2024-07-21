package org.dnyanyog.common;
import java.sql.*;

public class DBUtils {
	private static Connection connection;
	private static Statement statement;
	
	static {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce_api","root","simran@123");
			
			statement=connection.createStatement();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static ResultSet SelectQuery(String query) throws SQLException {
		ResultSet result=statement.executeQuery(query);
		return result;
	}
	
	public static int executeQuery(String query) throws SQLException {
		int rowsaffected=statement.executeUpdate(query);
		return rowsaffected;
	}
}
