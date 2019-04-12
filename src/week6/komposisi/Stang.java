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
public class Stang {
    private String bahan;
    private int lebar;

    public Stang() {
    }

    public Stang(String bahan, int lebar) {
        this.bahan = bahan;
        this.lebar = lebar;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    @Override
    public String toString() {
        return "Stang{" + "bahan=" + bahan + ", lebar=" + lebar + '}';
    }
    
    
    
}
