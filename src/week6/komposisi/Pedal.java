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
public class Pedal {
    private int dimensi;
    private String warna;
    private String bahan;

    public Pedal() {
    }

    public Pedal(int dimensi, String warna, String bahan) {
        this.dimensi = dimensi;
        this.warna = warna;
        this.bahan = bahan;
    }

    public int getDimensi() {
        return dimensi;
    }

    public void setDimensi(int dimensi) {
        this.dimensi = dimensi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    @Override
    public String toString() {
        return "Pedal{" + "dimensi=" + dimensi + ", warna=" + warna + ", bahan=" + bahan + '}';
    }
    
    
}
