/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.agregasi;

/**
 *
 * @author ACER
 */
public class Mahasiswa {
    private String nrp;
    private String nama;
    private String alamat;
    private int umur;

    public Mahasiswa() {
    }

    public Mahasiswa(String nrp, String nama, String alamat, int umur) {
        this.nrp = nrp;
        this.nama = nama;
        this.alamat = alamat;
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

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nrp=" + nrp + ", nama=" + nama + ", alamat=" + alamat + ", umur=" + umur + '}';
    }
    
    
}
