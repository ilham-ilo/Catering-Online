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
public class Persegi implements BangunDatar {
    public int panjang;
    public int lebar;

    public Persegi() {
    }

    public Persegi(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
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

    @Override
    public String toString() {
        return "PersegiPanjang{" + "panjang=" + panjang + ", lebar=" + lebar + '}';
    }

    @Override
    public double luas(){
        return this.panjang this.lebar;
    }

    @Override
    public double keliling(){
        return 2*(this.panjang+this.lebar);
    }

}
