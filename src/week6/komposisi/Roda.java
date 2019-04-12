/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.komposisi;

/**
 *
 * @author ACER
 */
public class Roda {
    private String tipe;
    private int dimensi;
    private String velg;

    public Roda() {
    }

    public Roda(String tipe, int dimensi, String velg) {
        this.tipe = tipe;
        this.dimensi = dimensi;
        this.velg = velg;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getDimensi() {
        return dimensi;
    }

    public void setDimensi(int dimensi) {
        this.dimensi = dimensi;
    }

    public String getVelg() {
        return velg;
    }

    public void setVelg(String velg) {
        this.velg = velg;
    }

    @Override
    public String toString() {
        return "Roda{" + "tipe=" + tipe + ", dimensi=" + dimensi + ", velg=" + velg + '}';
    }
    
    
}
