/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_OOP;

/**
 *
 * @author ACER
 */
public class Kerucut extends Lingkaran implements BangunRuang {
    private int tinggi;
    private int sisi;

    public Kerucut() {
    }

    public Kerucut(int tinggi, int sisi, double jarijari) {
        super(jarijari);
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getJarijari() {
        return jarijari;
    }

    @Override
    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }



    @Override
    public String toString() {
        return "Kerucut{" + "tinggi=" + tinggi + ", sisi=" + sisi + '}';
    }

    @Override
    public double volume(){
        return 0.53.14 this.jari jari this.jarijari this.tinggi;
    }

    @Override
    public double luaspermukaan(){
        return 3.14 this.jarijari * (this.jarijari + this.sisi);
    }
}