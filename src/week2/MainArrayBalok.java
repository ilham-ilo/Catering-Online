/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class MainArrayBalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size;
        size = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah balok"));
        Balok[] arrBlk = new Balok[size];
        
        for(int i=0; i<size; i++){
            arrBlk[i] = setElemenBalok();
        }
        
        for(Balok blk: arrBlk){
            System.out.println(blk.toString());
            System.out.println("Dengan volume = " + blk.volume());
        }
    }
    
    public static Balok setElemenBalok() {
        // TODO code application logic here
        Balok blk = new Balok();
        double panjang, lebar, tinggi;
        
        panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang balok"));
        lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar balok"));
        tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi balok"));
        
        blk.setPanjang(panjang);
        blk.setLebar(lebar);
        blk.setTinggi(tinggi);
        
        return blk;
    }
    
}
