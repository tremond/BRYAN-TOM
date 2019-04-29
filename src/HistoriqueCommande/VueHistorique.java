package HistoriqueCommande;

import java.sql.SQLException;
import java.sql.Statement;

import javafx.scene.control.ScrollPane;
import javafx.scene.text.Text;
import tools.ConnexionBdd;

public class VueHistorique extends ScrollPane 
{
	public VueHistorique() {
		Statement state;
		
		try {
		state = ConnexionBdd.getConnexion().createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Text title = new Text("Historique de commandes");
		
	}	
}
