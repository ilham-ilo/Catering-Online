/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author ACER
 */
public class Balok extends Bangun {
    
    private int panjang;
    private int lebar;
    private int tinggi;

    public Balok() {
    }

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    public int hitungVolume(){
        return this.panjang * this.lebar * this.tinggi;
    }
    
    public int luasPermukaan(){
        return 2 * (this.panjang * this.lebar + this.panjang * this.tinggi + this.lebar * this.tinggi);
    }

    @Override
    public String toString() {
        return super.toString() + "panjang = " + panjang + ", lebar = " + lebar + ", tinggi = " + tinggi + "volume = " + this.hitungVolume() + "luas permukaan = " + this.luasPermukaan() + '}';
    }
    
}
