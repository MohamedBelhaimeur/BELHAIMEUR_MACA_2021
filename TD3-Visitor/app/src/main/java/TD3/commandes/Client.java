package TD3.commandes;

import TD3.Visitor.PrePostVisitor;
import TD3.Visitor.Visitor;
import TD3.visitable.PrePostVisitable;
import TD3.visitable.Visitable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Client  implements PrePostVisitable, Visitable {
    private List<Commande>liste_commande;

    public List<Commande> getListe_commande() {
        return liste_commande;
    }

    private String name;
    public Client(String name){
        this.liste_commande=new ArrayList<>();
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void addCommande(Commande commande){
        this.liste_commande.add(commande);
    }
    public void addligne(String commande,Ligne ligne){

        Iterator<Commande> i=liste_commande.iterator();
        while(i.hasNext()){
            Commande commandetemp=i.next();
            if(commandetemp.getName().equals(commande)){

                commandetemp.addLigne(ligne);
            }
        }
    }
    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);

        Iterator<Commande> i=liste_commande.iterator();
        while(i.hasNext()){
            i.next().accept(prePostVisitor);

        }
        prePostVisitor.postVisit(this);
    }

    @Override
    public void accept(Visitor visitor) {
    visitor.visit(this);
        Iterator<Commande> i=liste_commande.iterator();
        while(i.hasNext()){
            i.next().accept(visitor);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
