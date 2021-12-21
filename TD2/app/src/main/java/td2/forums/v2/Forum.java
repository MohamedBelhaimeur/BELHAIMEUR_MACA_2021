package td2.forums.v2;

public class Forum extends Conteneur {
    public Forum(String sujet) {
        super(sujet);
    }

    @Override
    public String typeRepr() {
        return "Forum - topic: "+ this.sujet()+"\n contenu: [\n"+this.contenue()+"]";
    }

    @Override
    public String toString() {
        return this.typeRepr();
    }
}
