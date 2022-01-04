/*
* This is the Truck class.
*
* @author  Hussein Mansour
* @version 1.0
* @since   2021-12-17
*/

/**
* Truck class inheritance from Vehicle.
*/
public class Truck extends Vehicle {

    /**
    * Air Break.
    */
    private String airBreak;

    /**
    * Number of truck tires.
    *
    * @param nbbtires number tires.
    */
    private int nbbtires = 1;

    /**
    * Class Constructor For The Truck Class (1).
    *
    * @param airBreakk Air Break.
    */
    public Truck(String airBreakk) {
        airBreak = airBreakk;
    }

    /**
     * Class Constructor For The Truck Class (2).
     *
     * @param ntires Number of Tires.
     */
    public Truck(int ntires) {
        nbbtires = ntires;
    }

    /**
    * Sets & Gets the Truck air break.
    *
    * @param airBreak Set Air Break for truck.
    */

    // Setter.
    public final void setAirBreak(String airBreak) {
        this.airBreak = airBreak;
    }

    // Getter.
    public final String getAirBreak() {
        return airBreak;
    }
}
