package TD3.commandes;

import TD3.Visitor.PrePostVisitor;
import TD3.Visitor.Visitor;
import TD3.visitable.PrePostVisitable;
import TD3.visitable.Visitable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Commande implements PrePostVisitable, Visitable {
    private String name;
    private List<Ligne> liste_ligne=new ArrayList<>();
    public Commande(String name){
        this.name=name;
    }
    public void addLigne(Ligne ligne){
        this.liste_ligne.add(ligne);
    }
    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        prePostVisitor.postVisit(this);
        Iterator<Ligne> i=liste_ligne.iterator();
        while(i.hasNext()){
            i.next().accept(prePostVisitor);

        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commande commande = (Commande) o;
        return Objects.equals(name, commande.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        Iterator<Ligne> i = liste_ligne.iterator();
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
