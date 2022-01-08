package td1.refactor.api.general;

public enum SauceType implements FoodConstituent{
    BURGER,BARBECUE,BEARNAISE;

    @Override
    public double calories_per_100g() {
        double retour = 0;
        switch (this) {
            case BEARNAISE:
                retour = 400;
                break;
            case BARBECUE:
                retour = 100;
                break;
            case BURGER:
            default:
                retour = 220;
        }
        return retour;
    }
}
