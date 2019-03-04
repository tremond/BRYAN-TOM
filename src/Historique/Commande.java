package Historique;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Commande 
{
	public void Connexionbdd() throws SQLException 
	{
	Connection connex = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddTapas", "root", "");
	
	Statement state = connex.createStatement();
	
	}
}
