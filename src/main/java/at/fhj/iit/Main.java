package at.fhj.iit;

public class Main {

    public static void main(String[] args){
        seperatorLine();
        Coffee blackCoffee = new Coffee("Schwarzer Kaffee", 500, 3, 0, false);
        blackCoffee.addSugarSpoon(2);
        System.out.println(blackCoffee);
        seperatorLine();

        //creates a new Beer Object and opens the bottle up.
        Beer heineken = new Beer("Heineken", true);
        heineken.openBottle(heineken.getBottleIsClosed());
        seperatorLine();
    }

    public static void seperatorLine(){
        for (int i = 0; i < 100; i++) {
            System.out.printf("-");
        }
        System.out.println();
    }
}
