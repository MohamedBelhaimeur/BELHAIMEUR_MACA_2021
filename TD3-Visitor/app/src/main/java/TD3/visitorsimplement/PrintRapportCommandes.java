package TD3.visitorsimplement;

import TD3.Visitor.Visitor;
import TD3.commandes.Client;
import TD3.commandes.Commande;
import TD3.commandes.GroupeClient;
import TD3.commandes.Ligne;

public class PrintRapportCommandes implements Visitor {
    @Override
    public void visit(GroupeClient groupeClient) {
        System.out.println("Groupe "+groupeClient.getName()+" : ");
    }

    @Override
    public void visit(Client client) {
        int price=0;
        for (Commande index:client.getListe_commande()) {
            price=price+index.getListe_ligne().stream().mapToInt(i->i.getNumero()).sum();
        }
        System.out.println("Le client "+client.getName()+" doit "+price+" euros");
    }

    @Override
    public void visit(Commande commande) {

       // System.out.println(commande.getName());
    }

    @Override
    public void visit(Ligne ligne) {

    //System.out.println(ligne.getNumero()+" euros");
    }


}
