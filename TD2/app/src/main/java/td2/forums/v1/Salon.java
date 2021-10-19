package td2.forums.v1;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Message> liste_message;
    private final String topic ;
    public Salon(String topic){
        this.topic=topic;
        this.liste_message=new ArrayList<>();
    }
    public String sujet(){
        return this.topic;
    }
    public void add(Message child){
        this.liste_message.add(child);
    }
    public void remove(Salon child){
        this.liste_message.remove(child);
    }
    public int size(){
        return this.liste_message.size();
    }
}
