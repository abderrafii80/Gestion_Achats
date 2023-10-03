package Gestion_Achat;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		System.out.println("===================== Gestion d'Achats ==================");
		Client c1 = new Client("Dohn","Joe","JD2345","Bruxelle","Belgique");
		c1.afficher();
		Produit p1 = new Produit(2,"Lait",LocalDate.of(2023, 5, 18),4);
		Produit p2 = new Produit(1,"Thé",LocalDate.of(2023, 5, 2),20);
		Produit p3 = new Produit(1,"Pain",LocalDate.of(2023, 5, 19),1);
		Produit p4 = new Produit(3,"Eau",LocalDate.of(2023, 4, 13),13);
		
		Facture f1 = new Facture("F-0001");
		f1.ajouterProduit(p1);
		f1.ajouterProduit(p2);
		f1.ajouterProduit(p3);
//		f1.supprimerProduit(p2);
		f1.ajouterProduit(p4);
		f1.afficherFacture();

	}

}
