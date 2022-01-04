/*
* This program is the Main program.
*
* @author  Hussein Mansour
* @version 1.0
* @since   2021-12-17
*/

/**
* This is the Main class program.
*/
final class Main {

    /**
    * Space.
    */
    public static final String SPACE = "\n";

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting... the main method
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // Bike.
        // Using only the two Constructors.
        // Bike New number of Tires.
        System.out.println("Bike:" + SPACE);
        final Bike bike = new Bike(4);
        System.out.print("New number Of tires: ");
        System.out.print(bike.nbtires);
        System.out.println(SPACE);
        // Bike New Ring Sound.
        final Bike bbike = new Bike("Ring Ring");
        System.out.print("New Ring Sound: ");
        System.out.print(bbike.ring);
        System.out.println(SPACE);

        // Truck.
        // using only the two Constructors.
        // Truck New number of Tires.
        System.out.println("Truck:" + SPACE);
        final Truck truck = new Truck(8);
        System.out.print("New number of tires: ");
        System.out.print(truck.nbbtires);
        System.out.println(SPACE);
        // Truck New break.
        final Truck truckk = new Truck("Break! Break!");
        System.out.print("New Break Statment: ");
        System.out.print(truckk.airBreak);
        System.out.println(SPACE);

        // Done.
        System.out.println("Done.");
    }
}
