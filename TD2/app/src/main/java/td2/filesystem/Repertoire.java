package td2.filesystem;



import java.util.ArrayList;
import java.util.List;

public class Repertoire extends ComposantImpl implements Composite {
    private List<Composant> liste_component=new ArrayList<>();

    public Repertoire(String name, Owner owner) {
        super(name, owner);
    }

    @Override
    public int getSize() {
        return this.liste_component.size();
    }

    @Override
    public String getContent() {

            String result= "";
            result =result +"\n   fichiers: [ \n";
            for (Composant index:liste_component){
                result=result+"{ "+index.toString()+" } ";
            }
            result=result+" ] \n ";
            return result;
    }

    @Override
    public Boolean isComposite() {
        return true;
    }


    @Override
    public List<Composant> getChildren() {
        return this.liste_component;
    }

    @Override
    public boolean removeChildren(List<Composant> t) {
        return this.liste_component.removeAll(t);
    }

    @Override
    public void addChild(Composant o) {
    this.liste_component.add(o);
    }

    @Override
    public boolean removeChild(Composant o) {
        return this.liste_component.remove(o);
    }
    @Override
    public void appendContent(String name) {

    }
    public String toString(){
            String result= "Repertoire, name: "+super.getName()+", owner: "+super.getOwner().getName();
            result =result + this.getContent();
            return result;
        }

}
