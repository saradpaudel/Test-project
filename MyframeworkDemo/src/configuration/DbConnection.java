package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnection {
	
	public static void main(String[] args) {

		try {

		Class.forName("");
		Connection con = DriverManager.getConnection("url", "user", "password");
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("Write qury here");

		while (rs.next()) {

		String dbrecord = rs.getString("ColumnName");
		String dbrecord1= rs.getString("ColumnName2");
		System.out.println("data = " + dbrecord);
		System.out.println("data = " + dbrecord1);

		}

		} catch (Exception e) {

		e.printStackTrace();
		}
	}

}
