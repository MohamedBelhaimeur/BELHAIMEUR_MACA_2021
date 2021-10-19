package td2.forums.v1;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<Theme>liste_theme;
    private final String topic ;
    public Forum(String topic){
    this.topic=topic;
    this.liste_theme=new ArrayList<>();
    }
    public String sujet(){
        return this.topic;
    }
    public void add(Theme child){
        this.liste_theme.add(child);
    }
    public void remove(Theme child){
        this.liste_theme.remove(child);
    }
    public int size(){
        return this.liste_theme.size();
    }
}
