package TD3.commandes;

import TD3.Visitor.PrePostVisitor;
import TD3.Visitor.Visitor;
import TD3.visitable.PrePostVisitable;
import TD3.visitable.Visitable;

public class Ligne implements PrePostVisitable, Visitable {

    private String name;

    private int numero;

    public Ligne(String name,int numero){
        this.name=name;
        this.numero=numero;
    }

    public String getName() {
        return name;
    }

    public Ligne(String name){
        this.name=name;
        this.numero=0;

    }
    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        prePostVisitor.postVisit(this);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getNumero() {
        return numero;
    }
}
