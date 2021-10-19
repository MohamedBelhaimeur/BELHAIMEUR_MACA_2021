package td2.forums.v1;

import java.util.ArrayList;
import java.util.List;

public class Message {

    private final String topic ;
    private final String contenu;
    public Message(String topic,String contenu){
        this.topic=topic;
        this.contenu=contenu;
      
    }
    public String sujet(){
        return this.topic;
    }

}
