package td2.filesystem;

import java.util.List;

public interface Composite {
    List<Composant> getChildren();
    void addChild(Composant t);
    boolean removeChild(Composant t);
    boolean removeChildren(List<Composant>t);
}
