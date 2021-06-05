package at.fhj.iit;

/**
 * Concrete class RootBeer to abstract Drink class
 *
 * @author Gerwald Gindra-Vady
 */
public class RootBeer extends Drink implements Sellable{
    /**
     * price of the rootbeer
     */
    private double price = -1.0;

    /**
     * knowledge of the beverage RootBeer
     */
    private boolean iKnowRootBeer;

    /**
     * info about RootBeer
     */
    private String info = "";

    /**
     * liquid inside of the RootBeer
     */
    protected Liquid liquid;

    /**
     * Creates a new Rootbeer
     *
     * @param name name of the drink
     * @param liquid liquid used to make this drink
     * @param iKnowRootBeer already known by the consumer
     */
    RootBeer(String name, Liquid liquid, boolean iKnowRootBeer) {
        super(name);
        this.liquid = liquid;
        this.iKnowRootBeer = iKnowRootBeer;
    }

    /**
     * Returns name of liquid rootBeer
     *
     * @return the name as String
     */
    public String getName() { return name; }

    /**
     * Returns if rootBeer is known
     *
     * @return if known or not
     */
    public boolean getIKnowRootBeer() { return this.iKnowRootBeer; }

    /**
     * Returns volume of liquid rootBeer
     *
     * @return the volume in litre
     */
    @Override
    public double getVolume() { return liquid.getVolume(); }

    /**
     * Returns alcohol volume percent of liquid rootBeer
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent () { return liquid.getAlcoholPercent(); }

    /**
     * Returns if RootBeer is alcoholic
     *
     * @return if RootBeer is alcoholic
     */
    @Override
    public boolean isAlcoholic () {
        if(liquid.getAlcoholPercent() > 0){
            return true;
        }
        return false;
    }

    /**
     * Returns Info of RootBeer
     *
     * @return info String
     */
    public String getInfo () { return this.info; }

    /**
     * Prints information about Root_Beer
     */
    public void printInfo () {
        String beverageKnown = iKnowRootBeer == true ? "known" : "unknown";
        info = "Please enjoy this " + beverageKnown + " Root Beer called " + name + " with " + liquid.getAlcoholPercent() + " percent alcohol by volume";
        System.out.println(info);
    }

    /**
     * Sets the price of this rootbeer
     *
     * @param price of the rootbeer
     */
    @Override
    public void setPrice(int price) {
        this.price = liquid.getVolume() * price;
    }

    /**
     * Gets the price of this rootbeer
     *
     * @return price for this rootbeer
     */
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * Sell this rootbeer
     */
    @Override
    public void sell() {
        Registrierkasse.drinksToSellList.add(this);
    }

}