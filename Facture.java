package Gestion_Achat;

import java.util.ArrayList;

public class Facture {
	//private
	private String nom_facture;
	private ArrayList<Produit> produit;
	private int nombre_produit;
	private float montant_total;
	
	//public
	
	public Facture(String nom_facture) {
		this.nom_facture = nom_facture;
		this.nombre_produit = 0;
		this.produit = new ArrayList<>();
	}
	
	public boolean ajouterProduit(Produit produits) {
		if(!this.produit.contains(produits)) {
			this.produit.add(produits);
			this.nombre_produit++;
			return true;
		}
		return false;
	}
	
	public boolean supprimerProduit(Produit produits) {
		if(this.produit.contains(produits)) {
			this.produit.remove(produits);
			this.nombre_produit--;
			
			return true;
		}
		return false;
	}
	
	

	public String getNom_facture() {
		return nom_facture;
	}

	public void setNom_facture(String nom_facture) {
		this.nom_facture = nom_facture;
	}

	public int getNombre_produit() {
		return nombre_produit;
	}

	public void setNombre_produit(int nombre_produit) {
		this.nombre_produit = nombre_produit;
	}

	public float getMontant_total() {
		return montant_total;
	}

	public void setMontant_total(float montant_total) {
		this.montant_total = montant_total;
	}
	
	public float MontantTotalFacture() {
		for(int i=0;i<this.produit.size();i++) {
			this.montant_total += this.produit.get(i).getPrix_total();
		}
		return this.montant_total;
	}
	
	public void afficherFacture() {
		System.out.println("\n\t\t\t\tNumero Facture : "+this.nom_facture);
		System.out.println("\t\t\t\tNombre Produit : "+this.nombre_produit);
		System.out.println("\n =========================================================");
		
		System.out.println("\nQte\tProduit\t\tDate achat\tPrix\tPrix Total");
		System.out.println("----------------------------------------------------------");
		for(int i=0;i<this.produit.size();i++) {
			System.out.println(""+this.produit.get(i).getQuantite()+"\t"+this.produit.get(i).getNom_produit()+"\t   \t"
					+this.produit.get(i).getDate_achat()+"\t"+this.produit.get(i).getPrix()+"  \t   "+this.produit.get(i).getPrix_total());
			
		}
		System.out.println("\n\t\t\t\tTotal : "+this.MontantTotalFacture()+" DHS .");
	}
//
//	@Override
//	public String toString() {
//		return "Numero Facture : " + nom_facture +  "\nNombre de produit : " + nombre_produit
//				+ "\nMontant Total : " + this.MontantTotalFacture()+ "\n -> " + produit;
//	}
	
	
	
}
