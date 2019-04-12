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
public class Persegi {
    
    private double sisi;
    
    //kostruktor kosong
    public Persegi() {
        
    }
    
    //konstruktor isi
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    
    //akses modifier returnValue nameMethod ParameterList
    public double hitungLuas(){
        double luas;
        luas = this.sisi * this.sisi;
        return luas;
    }
    
    public double hitungLuas(double sisi){
        return sisi * sisi;
    }
    
    public double hitungKeliling(){
         return 4 * this.sisi;
    }
    
    @Override
    public String toString() {
        return "Persegi{" + "sisi = " + sisi + " dengan luas = " + hitungLuas() + '}';
    }
    
}
