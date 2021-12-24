package TD3.visitorsimplement;

import TD3.Visitor.PrePostVisitor;
import TD3.commandes.Client;
import TD3.commandes.Commande;
import TD3.commandes.GroupeClient;
import TD3.commandes.Ligne;

public class XMLRapportCommandes implements PrePostVisitor {
    @Override
    public void preVisit(GroupeClient groupeClient) {
    System.out.println("<groupe>");
    }

    @Override
    public void preVisit(Client client) {
        System.out.println("<client name= \""+client.getName()+"\">");
    }

    @Override
    public void preVisit(Commande commande) {
        System.out.println("<commande name= \""+commande.getName()+"\">");
    }

    @Override
    public void preVisit(Ligne ligne) {
        System.out.print("<ligne name=\""+ligne.getName()+"\" sum="+ligne.getNumero());
    }

    @Override
    public void postVisit(GroupeClient groupeClient) {
        System.out.println("</groupe>");
    }

    @Override
    public void postVisit(Client client) {
        System.out.println("</client>");
    }

    @Override
    public void postVisit(Commande commande) {
        System.out.println("</commande>");
    }

    @Override
    public void postVisit(Ligne ligne) {
        System.out.println("/>");
    }
}
