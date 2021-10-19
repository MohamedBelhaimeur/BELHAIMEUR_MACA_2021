package td2.filesystem;

public class FSFactory {
    final FSFactory fsFactory = new FSFactory();

    private FSFactory() {


    }

    public FSFactory getInstance() {
        return this.fsFactory;
    }

    public Composant createComposant(ComposantType type, String name, Owner owner) {
    Composant composant=null;
    if(type.equals("FICHIER")){
        composant=new Fichier(name,owner);

    }
        if(type.equals("REPERTOIRE")){
            composant=new Repertoire(name,owner);

        }
        return composant;

    }
}
