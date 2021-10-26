package TD3.commandes;

import TD3.Visitor.PrePostVisitor;
import TD3.Visitor.Visitor;
import TD3.visitable.PrePostVisitable;
import TD3.visitable.Visitable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupeClient implements PrePostVisitable, Visitable {
        List<Client> liste_client;
    private String name;
    public GroupeClient(String name){
        this.name=name;
        this.liste_client=new ArrayList<>();
    }
    public void addClient(Client client){
        this.liste_client.add(client);
    }
    public void addCommande(String client,Commande commande){
        Iterator <Client>i=liste_client.iterator();
        while(i.hasNext()){
            if(i.next().getName().equals(client)){
                i.next().addCommande(commande);
            }
        }
    }
    public void addLigne(String texte,String client,Ligne ligne){
        Iterator <Client>i=liste_client.iterator();
        while(i.hasNext()){
            if(i.next().getName().equals(client)){
                i.next().addligne(texte,ligne);
            }
        }
    }
    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        prePostVisitor.postVisit(this);

        Iterator<Client> i=liste_client.iterator();
        while(i.hasNext()){
            i.next().accept(prePostVisitor);

        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        Iterator <Client>i=liste_client.iterator();
        while(i.hasNext()){
            i.next().accept(visitor);

        }

    }
}
