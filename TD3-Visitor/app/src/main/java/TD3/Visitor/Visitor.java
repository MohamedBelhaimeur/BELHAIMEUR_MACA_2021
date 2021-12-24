package TD3.Visitor;

import TD3.Visitor.AbstractVisitor;
import TD3.commandes.Client;
import TD3.commandes.Commande;
import TD3.commandes.GroupeClient;
import TD3.commandes.Ligne;

public interface Visitor extends AbstractVisitor {
    void visit(GroupeClient groupeClient);
    void visit(Client client);
    void visit(Commande commande);
    void visit(Ligne ligne);
}
