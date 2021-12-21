package td2.forums.v2;

public class Salon extends Conteneur <Message> implements IContenu<Salon> {
    public Salon(String sujet) {
        super(sujet);
    }

    @Override
    public String typeRepr() {
        return "\n   Salon : "+ this.sujet()+", contenu: ["+this.contenue()+"]";
    }
}
