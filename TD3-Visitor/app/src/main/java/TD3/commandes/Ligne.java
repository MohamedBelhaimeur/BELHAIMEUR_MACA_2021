package TD3.commandes;

import TD3.Visitor.PrePostVisitor;
import TD3.Visitor.Visitor;
import TD3.visitable.PrePostVisitable;
import TD3.visitable.Visitable;

public class Ligne implements PrePostVisitable, Visitable {

    private String name;
    private String texte;
    private int numero;

    public Ligne(String name,int numero){
        this.name=name;
        this.texte="";
        this.numero=numero;
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
}
