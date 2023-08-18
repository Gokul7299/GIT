package testt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jddbc {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "localhost//xe";
		String user = "user";
		String pass = "pass";
		Class.forName("jdbc.driver.thin//localhost:1521//xe");
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement state = con.createStatement();
		ResultSet result = state.executeQuery("Select * from dbname");
		boolean next = result.next();
		String name = result.getString("name");
	}

}
