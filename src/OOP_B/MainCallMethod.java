/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_B;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class MainCallMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //method class/static
        callStaticMethod();
        //method instant
        MainCallMethod omm = new MainCallMethod();
        omm.callInstantMethod();
    }
    //method class static dicirikan dgn penggunaan keyword static
    //akses modifier returnValue nameMethod ParameterList
    private static void callStaticMethod(){
        double sisi;
        sisi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan sisi persegi"));
        Persegi psg = new Persegi(sisi);
        System.out.println("Luas Persegi = " + psg.hitungLuas());
        System.out.println("Keliling persegi = " + psg.hitungKeliling());
    }
    private void callInstantMethod(){
        double sisi;
        sisi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan sisi persegi"));
        Persegi psg = new Persegi(sisi);
        System.out.println("Luas Persegi = " + psg.hitungLuas());
        System.out.println("Keliling persegi = " + psg.hitungKeliling());
    }
}
