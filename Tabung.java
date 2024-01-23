
package bangunruangg;


public class Tabung {
    
     double r, t;

    double volume() {
        double volume = 22.0 / 7.0 * r * r * t;
        System.out.println("Volume Tabung : " + volume + "cm3");
        return volume;
    }
}
