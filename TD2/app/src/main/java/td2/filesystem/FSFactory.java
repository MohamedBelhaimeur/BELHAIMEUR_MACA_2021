package td2.filesystem;

public class FSFactory {
    public static final FSFactory fsFactory = new FSFactory();

    private FSFactory() {


    }

    public static FSFactory getInstance() {
        return fsFactory;
    }

    public Composant createComposant(ComposantType type, String name, Owner owner) {
    Composant composant=null;
    if(type==ComposantType.FICHIER){
        composant=new Fichier(name,owner);
        return composant;

    }
        if(type==ComposantType.REPERTOIRE){
            composant=new Repertoire(name,owner);
            return composant;
        }
        System.out.println("test");
        return null;

    }
}
