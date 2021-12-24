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
          Client clienttemp=i.next();
          if(clienttemp.getName().equals(client)){


                    clienttemp.addCommande(commande);


            }
        }
    }

    public List<Client> getListe_client() {
        return liste_client;
    }

    public void setListe_client(List<Client> liste_client) {
        this.liste_client = liste_client;
    }

    public void addLigne(String client, String commande, Ligne ligne){
        Iterator <Client>i=liste_client.iterator();
        while(i.hasNext()){
            Client clienttemp=i.next();
            if(clienttemp.getName().equals(client)){
                clienttemp.addligne(commande,ligne);
            }
        }
    }
    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);


        Iterator<Client> i=liste_client.iterator();
        while(i.hasNext()){
            i.next().accept(prePostVisitor);

        }
        prePostVisitor.postVisit(this);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        Iterator <Client>i=liste_client.iterator();
        while(i.hasNext()){
            i.next().accept(visitor);

        }

    }

    public String getName() {
        return name;
    }
}
