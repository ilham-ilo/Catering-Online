/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author ACER
 */
public class Spaniel extends Dog {
    
    private String asal;

    public Spaniel() {
    }

    public Spaniel(String asal) {
        this.asal = asal;
    }

    public Spaniel(String asal, String nama, String breed) {
        super(nama, breed);
        this.asal = asal;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    @Override
    public String toString() {
        return "Spaniel{" + super.toString() + "asal=" + asal + "umur=" + AGE_SPANIEL + '}';
    }
    
    
}
