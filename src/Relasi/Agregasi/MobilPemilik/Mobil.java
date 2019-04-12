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
public class Mobil {

    /**
     * @param args the command line arguments
     */
    private String merk;
    private String no_Plat;
    private int thn_Keluaran;

    public Mobil() {
    }

    public Mobil(String merk, String no_Plat, int thn_Keluaran) {
        this.merk = merk;
        this.no_Plat = no_Plat;
        this.thn_Keluaran = thn_Keluaran;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getNo_Plat() {
        return no_Plat;
    }

    public void setNo_Plat(String no_Plat) {
        this.no_Plat = no_Plat;
    }

    public int getThn_Keluaran() {
        return thn_Keluaran;
    }

    public void setThn_Keluaran(int thn_Keluaran) {
        this.thn_Keluaran = thn_Keluaran;
    }
       
}
