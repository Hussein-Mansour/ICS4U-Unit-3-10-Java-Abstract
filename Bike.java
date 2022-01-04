/*
* This is the Bike class.
*
* @author  Hussein Mansour
* @version 1.0
* @since   2021-12-17
*/

/**
* Bike class inheritance from Vehicle.
*/
public class Bike extends Vehicle {

    /**
    * Ring bell.
    *
    * @param ring Variable ring.
    */
    private String ring;

    /**
    * Number of Bike tires.
    *
    * @param nbtires bike number tires.
    */
    private int nbtires = 1;

    /**
    * Class Constructor For The Bike Class (1).
    *
    * @param ringg String.
    */
    public Bike(String ringg) {
        ring = ringg;
    }

    /**
    * Class Constructor For The Bike Class (2).
    *
    * @param ntires Integer.
    */
    public Bike(int ntires) {
        nbtires = ntires;
    }

    /**
    * Sets the Bike ring bell.
    * Getts the Bike ring bell.
    *
    * @param ringg ring bell.
    */

    // Setter.
    public final void setRingBell(String ringg) {
        this.ring = ringg;
    }

    // Getter.
    public final String getRingBell() {
        return ring;
    }

    /**
    * Getts the Bike number of tires.
    *
    * @return nbtires
    */

    // Getter.
    public final int getNumbTires() {
        return nbtires;
    }
}
