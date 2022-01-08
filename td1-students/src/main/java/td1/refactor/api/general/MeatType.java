package td1.refactor.api.general;

public enum MeatType implements FoodConstituent {

    BEEF,WHITEFISH;

    @Override
    public double calories_per_100g() {
        double retour;
        switch (this) {
            case BEEF:
                retour=200;
                break;
            case WHITEFISH:
                retour = 160;
                break;

            default:
                retour = 180;
        }
        return retour;
    }

    public double price() {
        double retour;
        switch (this) {
            case BEEF:
                retour=10;
                break;
            case WHITEFISH:
                retour = 7;
                break;

            default:
                retour = 4;
        }
        return retour;
    }
}
