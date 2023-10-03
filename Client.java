package Gestion_Achat;

public class Client {
	//private
	private String nom;
	private String prenom;
	private String CIN;
	private String ville;
	private String pays;
	

	//public
	public Client(String nom, String prenom, String CIN, String ville, String pays) {
		this.nom = nom;
		this.prenom = prenom;
		this.CIN = CIN;
		this.ville = ville;
		this.pays = pays;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getCIN() {
		return CIN;
	}


	public void setCIN(String cIN) {
		CIN = cIN;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}
	
	public void afficher() {
		System.out.println("Nom    : "+this.nom);
		System.out.println("Prenom : "+this.prenom);
		System.out.println("CIN    : "+this.CIN);
		System.out.println("Ville  : "+this.ville);
		System.out.println("Pays   : "+this.pays);
	}
}
