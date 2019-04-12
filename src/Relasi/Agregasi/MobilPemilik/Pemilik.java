/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relasi.Agregasi.MobilPemilik;

/**
 *
 * @author ACER
 */
public class Pemilik {
    private String nama;
    private String alamat;
    private int jml_Mobil;
    private String no_platMbl;
    public Mobil mobil;

    public Pemilik(String nama, String alamat, int jml_Mobil, String no_platMbl, Mobil mobil) {
        this.nama = nama;
        this.alamat = alamat;
        this.jml_Mobil = jml_Mobil;
        this.no_platMbl = no_platMbl;
        this.mobil = mobil;
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

    public int getJml_Mobil() {
        return jml_Mobil;
    }

    public void setJml_Mobil(int jml_Mobil) {
        this.jml_Mobil = jml_Mobil;
    }

    public String getNo_platMbl() {
        return no_platMbl;
    }

    public void setNo_platMbl(String no_platMbl) {
        this.no_platMbl = no_platMbl;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }
     
    
}
