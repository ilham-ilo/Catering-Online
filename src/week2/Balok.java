/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author ACER
 */
public class Balok {
   private double panjang;
   private double lebar;
   private double tinggi;

    public Balok() {
    }

    public Balok(double panjang) {
        this.panjang = panjang;
    }

    public Balok(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double volume(){
        return this.panjang * this.lebar * this.tinggi;
    }
    
    public double volume(double panjang){
        return panjang * this.lebar * this.tinggi;
    }
    
    public double volume(int panjang){
        return panjang * this.lebar * this.tinggi;
    }
    
    public double volume(int panjang, double lebar){
        return panjang * lebar * this.tinggi;
    }
    
     public double volume(double panjang, int lebar){
        return panjang * lebar * this.tinggi;
    }

    @Override
    public String toString() {
        return "Balok{" + "panjang=" + panjang + ", lebar=" + lebar + ", tinggi=" + tinggi + '}';
    }
     
}
