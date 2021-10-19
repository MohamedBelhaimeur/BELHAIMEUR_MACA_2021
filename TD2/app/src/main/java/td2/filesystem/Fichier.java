package td2.filesystem;

public class Fichier extends ComposantImpl{
    private StringBuilder content;
    public Fichier(String name, Owner owner) {
        super(name, owner);
    }


    @Override
    public Owner getOwner() {
        return this.getOwner();
    }

    @Override
    public void setOwner(Owner owner, Boolean recursive) {
    if(recursive==false){
        this.setOwner(owner,recursive);
    }
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
        return this.content.toString();
    }
}
