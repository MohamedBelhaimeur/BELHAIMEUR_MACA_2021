package td2.filesystem;

public  abstract class ComposantImpl implements Composant {
    private final String name;
    private Owner owner;
    public ComposantImpl(String name,Owner owner){
        this.name=name;
        this.owner=owner;
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
