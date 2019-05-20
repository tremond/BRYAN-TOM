package metier;

import java.sql.Statement;
import tools.ConnexionBdd;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Client {
	
	private static int _idClient;
	private static String _nom;
	private static String _couleur;
	private static int _idGroupe;
	
	public static int get_idGroupe() {
		return _idGroupe;
	}

	public void set_idGroupe(int _idGroupe) {
		this._idGroupe = _idGroupe;
	}

	public static String get_nom() {
		return _nom;
	}

	public void set_nom(String _nom) {
		this._nom = _nom;
	}

	public static String getCouleur() {
		return _couleur;
	}

	public void setCouleur(String couleur) {
		this._couleur = couleur;
	}

	public static int get_idClient() {
		return _idClient;
	}

	public void set_idClient(int _idClient) {
		this._idClient = _idClient;
	}
	
	// récupérer champs et les mettre en attributs
	
	public static void fillClient(int idClient) {
		Statement state;
		
		try {
			state = ConnexionBdd.getConnexion().createStatement();
			
			ResultSet resultat = state.executeQuery("SELECT * FROM Client WHERE client.idClient =" + idClient); 
			
			ResultSetMetaData resultMeta = resultat.getMetaData();
			for ( int i = 1; i <= resultMeta.getColumnCount(); i++ ) {
				System.out.println(resultMeta.getColumnName(i));
			}
			
			while(resultat.next()) {
		    	for (int i = 1; i <= resultMeta.getColumnCount(); i++) {
		    		System.out.println(resultat.getObject(i).toString());
		    	}
		    }
			resultat.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	
	public static void save() {
		Statement state;
		if ( get_idClient() == 0 ) {
			try {
				state = ConnexionBdd.getConnexion().createStatement();
				state.executeUpdate("INSERT INTO Client(idClient, pseudo, couleur, idGroupe) VALUES (" + get_idClient() + ",'" + get_nom() + "','" + getCouleur() + "'," + get_idGroupe() + ")");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			try {
				state = ConnexionBdd.getConnexion().createStatement();
				//FAIRE REQUETE UPDATE
				state.executeUpdate("UPDATE Client SET client.pseudo = " + get_nom() + ", client.couleur = " + getCouleur() + "  WHERE client.idClient = " + get_idClient());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	//si l'id client = 0 ,insert tous les attributs dans la table
	// si l'id client != 0 ,update
	/*public void saveclient(int idClient) {
	 
		try {
			
		}
	}*/

}
