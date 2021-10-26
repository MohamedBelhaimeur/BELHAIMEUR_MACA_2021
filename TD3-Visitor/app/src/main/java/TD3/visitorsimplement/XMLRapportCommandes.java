package TD3.visitorsimplement;

import TD3.Visitor.PrePostVisitor;
import TD3.commandes.Client;
import TD3.commandes.Commande;
import TD3.commandes.GroupeClient;
import TD3.commandes.Ligne;

public class XMLRapportCommandes implements PrePostVisitor {
    @Override
    public void preVisit(GroupeClient groupeClient) {
    System.out.println(groupeClient);
    }

    @Override
    public void preVisit(Client client) {
        System.out.println(client);
    }

    @Override
    public void preVisit(Commande commande) {
        System.out.println(commande);
    }

    @Override
    public void preVisit(Ligne ligne) {
        System.out.println(ligne);
    }

    @Override
    public void postVisit(GroupeClient groupeClient) {
        System.out.println(groupeClient);
    }

    @Override
    public void postVisit(Client client) {
        System.out.println(client);
    }

    @Override
    public void postVisit(Commande commande) {
        System.out.println(commande);
    }

    @Override
    public void postVisit(Ligne ligne) {

    }
}
