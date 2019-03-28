package pagePrincipale;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Model 
{
	public static void connexionBdd() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/tp17tapas";
		String utilisateur = "root";
		String motDePasse = "";
		Connection connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
		
		Statement state = connexion.createStatement();
	}
}
