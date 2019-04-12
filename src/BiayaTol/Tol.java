/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiayaTol;

/**
 *
 * @author ACER
 */
public class Tol {
    
    private String asal;
    private String tujuan;

    public Tol() {
    }

    public Tol(String asal, String tujuan) {
        this.asal = asal;
        this.tujuan = tujuan;
    }

    public void informasi(){
        System.out.println("asal = " + this.asal + " tujuan = " + this.tujuan);
    }
}
