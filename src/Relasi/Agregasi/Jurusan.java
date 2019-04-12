/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relasi.Agregasi;

/**
 *
 * @author ACER
 */
public class Jurusan {
    private int kd_Jurusan;
    private String nm_Jurusan;
    private Mahasiswa mhs;

    public int getKd_Jurusan() {
        return kd_Jurusan;
    }

    public void setKd_Jurusan(int kd_Jurusan) {
        this.kd_Jurusan = kd_Jurusan;
    }

    public String getNm_Jurusan() {
        return nm_Jurusan;
    }

    public void setNm_Jurusan(String nm_Jurusan) {
        this.nm_Jurusan = nm_Jurusan;
    }

    public Mahasiswa getMhs() {
        return mhs;
    }

    public void setMhs(Mahasiswa mhs) {
        this.mhs = mhs;
    }
    
    
}
