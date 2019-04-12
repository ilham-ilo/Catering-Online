/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author ACER
 */
public class Bangun {
    private String nama;

    public Bangun() {
    }

    public Bangun(String nama) {
        this.nama = nama;
    }
   
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Bangun{" + "nama=" + nama + '}';
    }
    
       
}
