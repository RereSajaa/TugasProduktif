
package bangunruangg;


public class Main {
    
    public static void main(String[] args){
        
        BangunRuangg bangunruangg = new BangunRuangg();

        Bola bola = new Bola();
        bola.r = 4;
        bola.volume();

        Kubus kubus = new Kubus();
        kubus.s = 6;
        kubus.volume();

        Tabung tabung = new Tabung();
        tabung.r = 21;
        tabung.t = 34;
        tabung.volume();

        LimasSegitiga limassegitiga = new LimasSegitiga();
        limassegitiga.la = 13;
        limassegitiga.tl = 9;
        limassegitiga.volume();
    }
}
