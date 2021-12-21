package td2.forums.v2;

public class Theme extends Conteneur<Salon> implements IContenu<Message>{
    public Theme(String sujet) {
        super(sujet);
    }

    @Override
    public String typeRepr() {
        return "\n  Theme : "+ this.sujet()+", contenu: ["+this.contenue()+"]";
    }
}
