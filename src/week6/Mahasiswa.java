/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author ACER
 */
public class Mahasiswa {
    private String nrp;
    private String nama;
    private int umur;
    private String[] ListKodeMk;

    public Mahasiswa() {
    }

    public Mahasiswa(String nrp, String nama, int umur) {
        this.nrp = nrp;
        this.nama = nama;
        this.umur = umur;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String[] getListKodeMk() {
        return ListKodeMk;
    }

    public void setListKodeMk(String[] ListKodeMk) {
        this.ListKodeMk = ListKodeMk;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nrp=" + nrp + ", nama=" + nama + ", umur=" + umur + '}';
    }
        
    
}
