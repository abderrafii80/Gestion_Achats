package Gestion_Achat;

import java.time.LocalDate;

public class Produit {
	//private 
	private int quantite;
	private String nom_produit;
	private LocalDate date_achat;
	private float prix;
	private float prix_total;
	
	//public
	public Produit(int quantite, String nom_produit, LocalDate date_achat, float prix) {
		this.quantite = quantite;
		this.nom_produit = nom_produit;
		this.date_achat = date_achat;
		this.prix = prix;
		this.prix_total = this.prix * this.quantite;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public String getNom_produit() {
		return nom_produit;
	}

	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}

	public LocalDate getDate_achat() {
		return date_achat;
	}

	public void setDate_achat(LocalDate date_achat) {
		this.date_achat = date_achat;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public float getPrix_total() {
		return prix_total;
	}

	public void setPrix_total(float prix_total) {
		this.prix_total = prix_total;
	}
	

//
//	@Override
//	public String toString() {
//		return "" + quantite + "\t" + nom_produit + "\t" + date_achat + "\t" + prix + "\t" + prix_total+"\n";
//	}
	
}
