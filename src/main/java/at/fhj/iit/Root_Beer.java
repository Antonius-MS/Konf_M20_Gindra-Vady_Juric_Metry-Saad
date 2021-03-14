package at.fhj.iit;

/**
 * Concrete class Root_Beer to abstract Drink class
 */
public class Root_Beer extends Drink {

    /**
     * alcohol percentage of Root_Beer
     */
    private final double ALCOHOL_PERCENTAGE = 0;

    /**
     * alcohol in Root_Beer
     */
    private final boolean IS_ALCOHOLIC = false;

    /**
     * knowledge of the beverage Root_Beer
     */
    private boolean iKnowRoot_Beer;

    /**
     * uses only one liquid called Root_Beer
     */
    protected Liquid rootBeer;

    /**
     * Creates a Root_Beer object with given name and statement of knowledge of this kind of beverage
     *
     * @param name           name of the Root_Beer
     * @param iKnowRoot_Beer beverage is known or unknown
     * @return
     */
    Root_Beer(String name, boolean iKnowRoot_Beer) {
        super(name);
        this.iKnowRoot_Beer = iKnowRoot_Beer;

        /**
         * Returns volume of liquid rootBeer
         *
         * @return the volume in litre
         */
    }

    @Override
    public double getVolume() {
        return this.getVolume();
    }

    /**
     * Returns alcohol volume percent of liquid rootBeer
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent () {
        return ALCOHOL_PERCENTAGE;
    }

    /**
     * Returns if Root_Beer is alcoholic
     *
     * @return if Root_Beer is alcoholic
     */
    @Override
    public boolean isAlcoholic () {
        return IS_ALCOHOLIC;
    }

    /**
     * Returns information about Root_Beer
     *
     * @return information about knowledge of this beverage, name and alcohol percentage
     */
    public void printInfo () {
        String beverageKnown = iKnowRoot_Beer == true ? "known" : "unknown";
        String info =  "Please enjoy this " + beverageKnown + " Root Beer called " + name + " with " + this.getAlcoholPercent() + " percent alcohol by volume";
        System.out.println(info);
    }
}
