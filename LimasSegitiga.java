
package bangunruangg;


public class LimasSegitiga {
    
     double la, tl;

    double volume() {
        double volume = 1.0 / 3.0 * la * tl;
        System.out.println("Volume Limas Segitiga : " + volume + "cm3");
        return volume;
    } 
}
