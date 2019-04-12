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
public class LimasSegiEmpat implements BangunRuang {
    
    public int sisi;
    public int tinggi;
    public int alas;

    public LimasSegiEmpat() {
    }

    public LimasSegiEmpat(int sisi, int tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double luaspermukaan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
