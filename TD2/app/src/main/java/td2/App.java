package td2;

import td2.filesystem.*;
import td2.forums.v2.Forum;
import td2.forums.v2.Message;
import td2.forums.v2.Salon;
import td2.forums.v2.Theme;


public class App {
     public static void main(String[] args) {

         // PARTIE FILESYSTEM
         System.out.println("PARTIE 1: FileSYSTEM");
         FSFactory fsFactory = FSFactory.getInstance();
          Owner owner1 = new Owner("Sarah");
         Composant f1 = fsFactory.createComposant(ComposantType.FICHIER, "Fichier 1", owner1);
         Composant r1 = fsFactory.createComposant(ComposantType.REPERTOIRE, "Repertoire 1", owner1);
         ((Composite)r1).addChild(f1);
         f1.appendContent("Hello World\n");
         f1.appendContent("How are you doing?");
         System.out.println(r1);
         System.out.println(f1);

         // PARTIE FORUMS V2
         System.out.println("\n \n PARTIE 2: FORUMS REFACTOR");
         Forum forum = new Forum("Programmation orientée objet");

         Theme theme1 = new Theme("Constructeurs");
         Theme theme2 = new Theme("Design patterns");
         Salon salon1 = new Salon("Heritage");
         Salon salon2 = new Salon("Composition");
         Salon salon3 = new Salon("Pattern Composite");
         Message message1 = new Message("J’ai un probleme", "voila, j’ai essaye ...");
         Message message2 = new Message("Au secours","¸ca marche pas ...");
         Message message3 = new Message("Difference ?", "quelle est la difference entre l’aggregation et la composition ");
         Message message4 = new Message("Question","quand utilise-t-on le pattern composite ?");

         forum.add(theme1);
         forum.add(theme2);
         theme1.add(salon1);
         theme1.add(salon2);
         theme2.add(salon3);
         salon1.add(message1);
         salon1.add(message2);
         salon2.add(message3);
         salon3.add(message4);
         System.out.println(forum);
         }



}
