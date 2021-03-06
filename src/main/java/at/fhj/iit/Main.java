package at.fhj.iit;

/**
 * Creates drinks objects and calls their methods
 *
 * @author Gerwald Gindra-Vady
 * @author Valentina Juric
 * @author Antonius Metry Saad
 */
public class Main {
    /**
     * Starting point of the program
     *
     * @param args program arguments
     */
    public static void main(String[] args){
        seperatorLine();
        //creates a new Coffe Object with the passed parameters
        Coffee blackCoffee = new Coffee("Schwarzer Kaffee", new Liquid("Hot Water", 0.5, 0), 3, 0, false);
        blackCoffee.addSugarSpoon(2);
        System.out.println(blackCoffee);
        seperatorLine();

        //creates a new Beer Object and opens the bottle up.
        Beer heineken = new Beer("Heineken", new Liquid("Cold Water", 0.33, 5), true);
        heineken.openBottle(heineken.getBottleIsClosed());
        seperatorLine();

        //creates a new Root Beer object with the two passed parameters
        RootBeer aAndW = new RootBeer("AW", new Liquid("Lemonade", 0.5, 0), true);
        aAndW.printInfo();
        seperatorLine();

    }

    /**
     * Prints a line
     */
    public static void seperatorLine(){
        for (int i = 0; i < 100; i++) {
            System.out.printf("-");
        }
        System.out.println();
    }
}
