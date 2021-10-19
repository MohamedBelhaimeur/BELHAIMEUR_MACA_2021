package td2.forums.v1;

import java.util.ArrayList;
import java.util.List;

public class Theme {
    private List<Salon> liste_salon;
    private final String topic ;
    public Theme(String topic){
        this.topic=topic;
        this.liste_salon=new ArrayList<>();
    }
    public String sujet(){
        return this.topic;
    }
    public void add(Salon child){
        this.liste_salon.add(child);
    }
    public void remove(Salon child){
        this.liste_salon.remove(child);
    }
    public int size(){
        return this.liste_salon.size();
    }
}
