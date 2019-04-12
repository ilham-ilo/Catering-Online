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
public class Balok extends Persegi implements BangunRuang {
    private int tinggi;

    public Balok() {
    }

    public Balok(int tinggi, int panjang, int lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public String toString() {
        return "Balok{" + "tinggi=" + tinggi + '}';
    }
    @Override
    public double volume(){
        return this.panjang this.lebar this.tinggi;
    }

    @Override
    public double luaspermukaan(){
        return (2 this.panjang this.lebar)+(2 this.lebar this.tinggi)+(2 this.panjang * this.tinggi);
    }

}

