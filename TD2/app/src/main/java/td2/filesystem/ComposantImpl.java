package td2.filesystem;

public  abstract class ComposantImpl implements Composant {
    private final String name;
    private Owner owner;
    public ComposantImpl(String name,Owner owner){
        this.name=name;
        this.owner=owner;
    }


    @Override
    public Owner getOwner() {
        return this.owner;
    }

    @Override
    public void setOwner(Owner owner, Boolean recursive) {
        if(recursive==false){
            this.setOwner(owner,recursive);
        }
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean equals(Object o){
       return owner.equals(o);
    }
    public int hashCode(){
        return owner.hashCode();
    }


}
