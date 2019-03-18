package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class pageDeConnexion extends Application {
	public void start (Stage primaryStage) {
		primaryStage.setTitle("Page de Connexion");
		primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(pageDeConnexion.class);
	}
	
	public static void Connexionbdd() {
		/* Connexion à la base de données */
		String url = "jdbc:mysql://localhost:3306/tp17tapas";
		String utilisateur = "root";
		String motDePasse = "";
		Connection connexion = null;
		Statement state = null;
		try {
		
		    connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
	
		    /* Ici, nous placerons nos requêtes vers la BDD */
		    state = connexion.createStatement();
		    
		    ResultSet resultat = state.executeQuery("SELECT * FROM client");
		    
		    
		    ResultSetMetaData resultMeta = resultat.getMetaData();	
		    while(resultat.next()) {
		    	for (int i = 1; i <= resultMeta.getColumnCount(); i++) {
		    		System.out.println(resultat.getObject(i).toString());
		    	}
		    }
		    resultat.close();
	
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
}	
