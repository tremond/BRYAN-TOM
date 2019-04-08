package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBdd {
	public static Connection getConnexion() throws SQLException {
		Connection connex = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp17tapas", "root", "root");
		return connex; 
	}
}