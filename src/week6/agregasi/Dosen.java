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
public class Dosen {
    private Mahasiswa[] lstBimbingan;
    private String nip; 
    private String nama;
    private String keahlian;

    public Dosen() {
    }

    public Dosen(String nip, String nama, String keahlian) {
        this.nip = nip;
        this.nama = nama;
        this.keahlian = keahlian;
    }

    public Mahasiswa[] getLstBimbingan() {
        return lstBimbingan;
    }

    public void setLstBimbingan(Mahasiswa[] lstBimbingan) {
        this.lstBimbingan = lstBimbingan;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }

    @Override
    public String toString() {
        return "Dosen{" + "lstBimbingan=" + lstBimbingan + ", nip=" + nip + ", nama=" + nama + ", keahlian=" + keahlian + '}';
    }
        
    
}
