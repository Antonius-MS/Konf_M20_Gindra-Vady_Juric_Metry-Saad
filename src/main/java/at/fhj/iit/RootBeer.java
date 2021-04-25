package at.fhj.iit;

/**
 * Concrete class RootBeer to abstract Drink class
 */
public class RootBeer extends Drink {

    /**
     * alcohol percentage of RootBeer
     */
    private final double ALCOHOL_PERCENTAGE = 0;

    /**
     * alcohol in RootBeer
     */
    private final boolean IS_ALCOHOLIC = false;

    /**
     * knowledge of the beverage RootBeer
     */
    private boolean iKnowRootBeer;

    /**
     * volume of RootBeer
     */
    private double volume;

    /**
     * info about RootBeer
     */
    private String info = "";

    /**
     * uses only one liquid called RootBeer
     */
    protected Liquid rootBeer;

    /**
     * Creates a RootBeer object with given name and statement of knowledge of this kind of beverage
     *
     * @param name           name of the RootBeer
     * @param iKnowRootBeer beverage is known or unknown
     * @return
     */
    RootBeer(String name, double volume, double ALCOHOL_PERCENTAGE, boolean iKnowRootBeer) {
        super(name);
        this.volume = volume;
        this.iKnowRootBeer = iKnowRootBeer;
    }

    /**
     * Returns name of liquid rootBeer
     *
     * @return the name as String
     */
    public String getName() { return this.name; }

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
    public double getVolume() { return this.volume; }

    /**
     * Returns alcohol volume percent of liquid rootBeer
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent () { return ALCOHOL_PERCENTAGE; }

    /**
     * Returns if RootBeer is alcoholic
     *
     * @return if RootBeer is alcoholic
     */
    @Override
    public boolean isAlcoholic () { return IS_ALCOHOLIC; }

    /**
     * Returns Info of RootBeer
     *
     * @return info String
     */
    public String getInfo () { return this.info; }

    /**
     * Returns information about Root_Beer
     *
     * @return information about knowledge of this beverage, name and alcohol percentage
     */
    public void printInfo () {
        String beverageKnown = iKnowRootBeer == true ? "known" : "unknown";
        info =  "Please enjoy this " + beverageKnown + " Root Beer called " + name + " with " + this.getAlcoholPercent() + " percent alcohol by volume";
        System.out.println(info);
    }
}
