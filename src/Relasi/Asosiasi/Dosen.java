/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relasi.Asosiasi;

/**
 *
 * @author ACER
 */
public class Dosen {
    private String Kddosen;
    private String[] nrpMHS;
    private int JmlMahasiswa;

    public String[] getNrpMHS() {
        return nrpMHS;
    }

    public void setNrpMHS(String[] nrpMHS) {
        this.nrpMHS = nrpMHS;
    }

    public int getJmlMahasiswa() {
        return JmlMahasiswa;
    }

    public void setJmlMahasiswa(int JmlMahasiswa) {
        this.JmlMahasiswa = JmlMahasiswa;
    }
    
}

