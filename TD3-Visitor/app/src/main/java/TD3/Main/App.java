package TD3.Main;

import TD3.Visitor.AbstractVisitor;
import TD3.Visitor.PrePostVisitor;
import TD3.Visitor.Visitor;
import TD3.commandes.Client;
import TD3.commandes.Commande;
import TD3.commandes.GroupeClient;
import TD3.commandes.Ligne;
import TD3.exceptions.MonException;
import TD3.visitorsimplement.PrintRapportCommandes;
import TD3.visitorsimplement.XMLRapportCommandes;


public final class App {
	private final GroupeClient groupeClient;
	private AbstractVisitor visiteur;
	
	public App(String nomGroupe) { // manque dans UML
		this.groupeClient = new GroupeClient(nomGroupe);
	}
	
	public App(String nomGroupe, AbstractVisitor v) {
		this(nomGroupe);
		this.visiteur = v;
	}
	
	public void setVisiteur(AbstractVisitor v) {
		this.visiteur = v;
	}

	public static void main(String[] args) throws MonException {
		AbstractVisitor xmlVisitor = new XMLRapportCommandes();
		AbstractVisitor printVisitor = new PrintRapportCommandes();
		//
		App m = new App("clients");
		//
		Client c1 = new Client("bob");
		Client c2 = new Client("joe");
		m.groupeClient.addClient(c1);
		m.groupeClient.addClient(c2);
		//
		Commande cde1 = new Commande("cde1");
		Commande cde2 = new Commande("cde2");
		Commande cde3 = new Commande("cde3");
		m.groupeClient.addCommande("bob",cde1);
		m.groupeClient.addCommande("bob", cde2);
		m.groupeClient.addCommande("joe", cde3);
		//
		Ligne l1 = new Ligne("l1",100);
		Ligne l2 = new Ligne("l2",200);
		Ligne l3 = new Ligne("l3",400);
		Ligne l4 = new Ligne("l4",800);
		m.groupeClient.addLigne("bob", "cde1", l1);
		m.groupeClient.addLigne("bob", "cde1", l2);
		m.groupeClient.addLigne("bob", "cde2", l3);
		m.groupeClient.addLigne("joe", "cde3", l4);
		//
		m.setVisiteur(printVisitor);
		m.groupeClient.accept((Visitor)m.visiteur);
		//
		m.setVisiteur(xmlVisitor);
		m.groupeClient.accept((PrePostVisitor)m.visiteur);
	}
}
