package connexion;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class pageDeConnexion {

		/* Connexion à la base de données */
		String url = "jdbc:mysql://localhost:3306/tp17tapas";
		String utilisateur = "root";
		String motDePasse = "";
		Connection connexion = null;
		try {
		    connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
	
		    /* Ici, nous placerons nos requêtes vers la BDD */
		    Statement statement = connexion.createStatement();
	
		} catch ( SQLException e ) {
		    /* Gérer les éventuelles erreurs ici */
		} finally {
		    if ( connexion != null )
		        try {
		            /* Fermeture de la connexion */
		            connexion.close();
		        } catch ( SQLException ignore ) {
		            /* Si une erreur survient lors de la fermeture, il suffit de l'ignorer. */
		        }
		}
}	
