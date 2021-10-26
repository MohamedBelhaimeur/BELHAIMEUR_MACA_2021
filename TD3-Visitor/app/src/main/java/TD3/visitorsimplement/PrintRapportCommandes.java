package TD3.visitorsimplement;

import TD3.Visitor.Visitor;
import TD3.commandes.Client;
import TD3.commandes.Commande;
import TD3.commandes.GroupeClient;
import TD3.commandes.Ligne;

public class PrintRapportCommandes implements Visitor {
    @Override
    public void visit(GroupeClient groupeClient) {
        System.out.println(groupeClient);
    }

    @Override
    public void visit(Client client) {
        System.out.println(client);
    }

    @Override
    public void visit(Commande commande) {
        System.out.println(commande);
    }

    @Override
    public void visit(Ligne ligne) {
    System.out.println(ligne);
    }


}
