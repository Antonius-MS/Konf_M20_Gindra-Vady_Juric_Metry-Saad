package at.fhj.iit;

public class Beer extends Drink {

    //instance variables
    private boolean bottleIsClosed;
    protected Liquid b;

    //constructor
    public Beer (String name, boolean bottleIsClosed) {
        super(name);
        this.bottleIsClosed = bottleIsClosed;
    }

    //getter for bottleIsClosed
    public boolean getBottleIsClosed() {
        return this.bottleIsClosed;
    }

    //setter for bottleIsClosed
    public void setBottleIsClosed(boolean bottleIsClosed) {
        this.bottleIsClosed = bottleIsClosed;
    }

    //method to open the Bottle & print that it is opening or already is open
    public void openBottle(boolean bottleClosed) {
        if (bottleClosed) {
            System.out.println("Opening bottle of your " + name + " beer...");
            setBottleIsClosed(false);
            System.out.println("The bottle is now open!");
        } else {
            System.out.println("Bottle is already open!");
        }
    }

    //return alcohol Volume of Liquid b
    @Override
    public double getVolume() {
        return b.getVolume();
    }

    //return alcohol percentage of Liquid b
    @Override
    public double getAlcoholPercent() {
        return b.getAlcoholPercent();
    }

    //gives information if Liquid b is alcoholic or not
    @Override
    public boolean isAlcoholic() {
        if(b.getAlcoholPercent() > 0){
            return true;
        }
        return false;
    }
}