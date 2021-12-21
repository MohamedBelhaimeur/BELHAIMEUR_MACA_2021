package td2.filesystem;

public class Fichier extends ComposantImpl{
    private StringBuilder content;
    public Fichier(String name, Owner owner) {
        super(name, owner);
        this.content=new StringBuilder();
    }




    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public String getContent() {
        return this.content.toString();
    }

    @Override
    public void appendContent(String name) {
    this.content.append(name);
    }

    @Override
    public Boolean isComposite() {
        return false;
    }

    public String toString(){
        return "Fichier, name: "+super.getName()+", owner: "+super.getOwner().getName()+", content: "+this.content.toString();
    }
}
