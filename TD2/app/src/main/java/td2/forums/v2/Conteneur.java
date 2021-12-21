package td2.forums.v2;

import java.util.ArrayList;
import java.util.List;

public abstract class Conteneur<T extends IContenu<T>>implements IConteneur {
    private String sujet;
    private List<IContenu<T>> list;

    public Conteneur(String sujet) {
        this.sujet = sujet;
        this.list=new ArrayList<>();
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public void add(IContenu child) {
    this.list.add(child);
    }

    @Override
    public void remove(int index) {
    this.list.remove(this.list.get(index));
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String sujet() {
        return this.sujet;
    }

    @Override
    public String contenue() {
        String contenu="";
        for (IContenu<T> index:list){
            contenu=contenu+index.typeRepr();
        }
        return contenu;
    }
}
