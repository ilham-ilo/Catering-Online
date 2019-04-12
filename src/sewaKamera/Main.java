/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sewaKamera;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Peminjam peminjam = new Peminjam();
        Kamera kamera = new Kamera();
        
        SewaKamera[] s = {peminjam};
        
        for (SewaKamera sewa : s){
            System.out.println(sewa);
            System.out.println("Biaya = "+sewa.biaya());
        }  
    }
}
