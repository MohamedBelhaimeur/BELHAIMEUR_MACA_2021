package td2.filesystem;

public class FSFactory {
    final FSFactory fsFactory=new FSFactory();
    private FSFactory(){


    }
   public FSFactory getInstance(){
        return this.fsFactory;
    }
    public Composant createComposant(ComposantType type,String name,Owner owner){

    }
}
