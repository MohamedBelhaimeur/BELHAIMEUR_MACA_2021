package td2.forums.v2;

public class Message implements IContenu<Message> {
    private final String sujet;
    private final String contenu;

    public Message(String sujet,String contenu) {

        this.sujet=sujet;
        this.contenu=contenu;
    }

    @Override
    public String sujet() {
        return this.sujet;
    }

    @Override
    public String contenue() {
        return this.contenu;
    }

    @Override
    public String typeRepr() {
        return "\n     Message : "+ this.sujet+", contenu: "+this.contenu+"";
    }
    @Override
    public String toString(){
        return "\n     Message : "+ this.sujet+", contenu: "+this.contenu+"";
    }
}
