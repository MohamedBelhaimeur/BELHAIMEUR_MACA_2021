package api;

public class Unite {
    DeplacementStrategy deplacement;
    AttaqueStrategy attaque;

    public Unite(DeplacementStrategy deplacement, AttaqueStrategy attaque){
        this.deplacement=deplacement;
        this.attaque=attaque;
    }

   public void seDeplacer(){
        deplacement.deplacer();
   };
   public void combattre(){
     attaque.attaquer();
   };

    public void setAttaque(AttaqueStrategy attaque) {
        this.attaque = attaque;
    }

    public void setDeplacement(DeplacementStrategy deplacement) {
        this.deplacement = deplacement;
    }
}
