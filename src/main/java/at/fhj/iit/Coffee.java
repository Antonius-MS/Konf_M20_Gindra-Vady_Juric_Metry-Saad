package at.fhj.iit;

/**
 * represents a coffee
 */
public class Coffee extends Drink {
    /**
     * alcohol percentage in a coffee
     */
    private final int ALCOHOL_PERCENTAGE = 0;

    /**
     * alcohol in a coffee
     */
    private final boolean IS_ALCOHOLIC = false;

    /**
     * volume of the coffee in milliliter
     */
    private int volumeInMilliliter = 0;

    /**
     * coffee spoons in the coffee
     */
    private int coffeeSpoon = 0;

    /**
     * sugar spoons in the coffee
     */
    private int sugarSpoon = 0;

    /**
     * milk in the coffee
     */
    private boolean withMilk = false;

    /**
     * Creates a Coffee object with given name, volume, coffee spoons, sugar spoons and milk
     *
     * @param name               name of the coffee
     * @param volumeInMilliliter volume of the the coffee
     * @param coffeeSpoon        coffee spoons in this coffee
     * @param sugarSpoon         sugar spoons in this coffee
     * @param withMilk           milk in this coffee
     */
    Coffee(String name, int volumeInMilliliter, int coffeeSpoon, int sugarSpoon, boolean withMilk) {
        super(name);
        this.volumeInMilliliter = volumeInMilliliter;
        this.coffeeSpoon = coffeeSpoon;
        this.sugarSpoon = sugarSpoon;
        this.withMilk = withMilk;
    }

    /**
     * Returns volume of the coffee
     *
     * @return the volume of coffee in milliliter
     */
    @Override
    public double getVolume() {
        return volumeInMilliliter;
    }

    /**
     * Returns alcohol percentage of coffee
     *
     * @return alcohol percentage of a coffee
     */
    @Override
    public double getAlcoholPercent() {
        return ALCOHOL_PERCENTAGE;
    }

    /**
     * Returns if coffee is alcoholic
     *
     * @return if coffee is alcoholic
     */
    @Override
    public boolean isAlcoholic() {
        return IS_ALCOHOLIC;
    }

    /**
     * Adds sugar spoons to the coffee
     *
     * @param amount amount of sugar spoons that should be added
     */
    public void addSugarSpoon(int amount) {
        sugarSpoon = sugarSpoon + amount;
    }

    /**
     * Returns which coffee has been ordered
     *
     * @return information about name, coffee spoons, sugar spoons and milk of the coffee
     */
    public String toString() {
        String milkInformation = withMilk == false ? "without milk" : "with milk";
        return "You ordered a coffee called " + name + " with " + coffeeSpoon + " coffee spoons" + ", " + sugarSpoon + " sugar spoons and " + milkInformation;
    }

    public String getName(){
        return name;
    }

    public int getCoffeeSpoon() {
        return coffeeSpoon;
    }

    public int getSugarSpoon() {
        return sugarSpoon;
    }

    public boolean isWithMilk() {
        return withMilk;
    }
}


