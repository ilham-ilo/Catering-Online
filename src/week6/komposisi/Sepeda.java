/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.komposisi;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Sepeda {
    private Roda roda;
    private Pedal pedal;
    private Stang stang;
    private String merk;
    private int harga;

    public Sepeda(Roda roda, Pedal pedal, Stang stang, String merk, int harga) {
        this.roda = roda;
        this.pedal = pedal;
        this.stang = stang;
        this.merk = merk;
        this.harga = harga;
    }
    
    public Sepeda(Pedal pedal, Stang stang, String merk, int harga) {
        this.roda = roda;
        this.pedal = pedal;
        this.stang = stang;
        this.merk = merk;
        this.harga = harga;
    }

    public Sepeda(Roda roda, Pedal pedal, Stang stang) {
        this.roda = roda;
        this.pedal = pedal;
        this.stang = stang;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public Pedal getPedal() {
        return pedal;
    }

    public void setPedal(Pedal pedal) {
        this.pedal = pedal;
    }

    public Stang getStang() {
        return stang;
    }

    public void setStang(Stang stang) {
        this.stang = stang;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    
    private Roda createRoda(){
        String tipe, velg;
        int dimensi;
        tipe = JOptionPane.showInputDialog("Masukkan tipe roda sepeda");
        velg = JOptionPane.showInputDialog("Masukkan tipe velg sepeda");
        dimensi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan dimensi roda sepeda"));
        return new Roda(tipe, dimensi, velg);
    }

    @Override
    public String toString() {
        return "Sepeda{" + "roda=" + roda + ", pedal=" + pedal + ", stang=" + stang + ", merk=" + merk + ", harga=" + harga + '}';
    }
    
    
}
