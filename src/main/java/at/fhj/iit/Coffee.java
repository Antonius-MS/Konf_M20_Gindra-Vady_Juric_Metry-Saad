
package at.fhj.iit;

/**
 * <h1>Coffee</h1>
 * <h2>Represents a coffee</h2>
 * A coffee can have a specific volume and be made with coffee spoons, sugar spoons and milk
 * <p>
 * Last-Change: 23.04.2021
 * @author Antonius Metry Saad
 */
public class Coffee extends Drink {

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
     * liquid inside of the coffee
     */
    protected Liquid liquid;

    /**
     * Creates a Coffee object with given name, volume, coffee spoons, sugar spoons and milk
     *
     * @param name name of the coffee
     * @param liquid liquid inside of the coffee
     * @param coffeeSpoon amount of coffee spoons
     * @param sugarSpoon amount of sugar spoons
     * @param withMilk coffee contains milk
     */
    Coffee(String name, Liquid liquid, int coffeeSpoon, int sugarSpoon, boolean withMilk) {
        super(name);
        this.liquid = liquid;
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
        return liquid.getVolume();
    }

    /**
     * Returns alcohol in coffee
     *
     * @return alcohol percentage of a coffee
     */
    @Override
    public double getAlcoholPercent() {
        return liquid.getAlcoholPercent();
    }

    /**
     * Returns if coffee is alcoholic
     *
     * @return if coffee is alcoholic
     */
    @Override
    public boolean isAlcoholic() {
        if(liquid.getAlcoholPercent() > 0)
            return true;
        else
            return false;

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

    /**
     * Returns coffee name
     *
     * @return the name of the coffee
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the amount of coffee spoons
     *
     * @return the amount of coffee spoons in the coffee
     */
    public int getCoffeeSpoon() {
        return coffeeSpoon;
    }

    /**
     * Returns the amount of sugar spoons
     *
     * @return the amount of sugar spoons in the coffee
     */
    public int getSugarSpoon() {
        return sugarSpoon;
    }

    /**
     * Returns if coffee is with milk
     *
     * @return if coffee is with milk
     */
    public boolean isWithMilk() {
        return withMilk;
    }
}

