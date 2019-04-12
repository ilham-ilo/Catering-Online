/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.komposisi;

/**
 *
 * @author ACER
 */
public class MainKomposisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pedal pedal = new Pedal(30, "Silver", "Baja");
        Roda roda =  new Roda ("Karet", 30, "Jari-jari");
        Stang stang = new Stang ("Besi", 100);
        Sepeda spd1 = new Sepeda(roda, pedal, stang);
        spd1.setMerk("Polygon");
        spd1.setHarga(1000000);
        Sepeda spd2 = new Sepeda(pedal, stang, "Wing", 1500000);
        Sepeda spd3 = new Sepeda(roda, pedal, stang, "Sky", 2000000);
        Sepeda[] lstSpd = {spd1, spd2, spd3};
        
        for (Sepeda spd : lstSpd){
            System.out.println(spd);
            System.out.println("Dengan komponen-komponen: ");
            System.out.println("Roda: " + spd.getRoda());
            System.out.println("Stang: "  + spd.getStang());
            System.out.println("Pedal: " + spd.getPedal());
        }
        
    }
    
}
