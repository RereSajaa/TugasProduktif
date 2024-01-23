
package bangunruangg;


public class Bola {
    
     double r;

    double volume() {
        double volume = 4.0 / 3.0 * 3.14 * r * r * r;
        System.out.println("Volume Bola : " + volume + "cm3");
        return volume;
    }
}
