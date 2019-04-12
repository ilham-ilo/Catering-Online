/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_B;

/**
 *
 * @author ACER
 */
public class MainPersegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //nama objeknya adalh psg
        Persegi psg = new Persegi(9);
        System.out.println("Luas Persegi = " + psg.hitungLuas());
        Persegi psg2 = new Persegi (8);
        System.out.println("Luas Persegi 2 = " + psg2.hitungLuas());
        System.out.println(psg.toString());
        //mengubah nllai atribut sisi dari objek psg
        psg.setSisi(11);
        System.out.println(psg.toString());
        System.out.println("Sisi persegi psg = " + psg.getSisi());
        System.out.println("Keliling persegi psg = " + psg.hitungKeliling());
        psg2.setSisi(7);
        System.out.println("Sisi persegi psg = " + psg2.getSisi());
        System.out.println("Keliling persegi psg2 = " + psg2.hitungKeliling());
    }
    
}
