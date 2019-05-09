package metier;

public class Commande {
	private int _idCommande;
	private int _numCommande;
	private String _heureCommande;
	
	public int get_idCommande()
	{
		return _idCommande;
	}
	public void set_idCommande(int _idCommande) 
	{
		this._idCommande = _idCommande;
	}
	public int get_numCommande() 
	{
		return _numCommande;
	}
	public void set_numCommande(int _numCommande) 
	{
		this._numCommande = _numCommande;
	}
	public String get_heureCommande() 
	{
		return _heureCommande;
	}
	public void set_heureCommande(String _heureCommande) 
	{
		this._heureCommande = _heureCommande;
	}
	
	
}
