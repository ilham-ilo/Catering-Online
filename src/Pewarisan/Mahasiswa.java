/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author ACER
 */
public class Mahasiswa extends Profile {
    private String nrp;
    private String jurusan;

    public Mahasiswa() {
    }

    public Mahasiswa(String nrp, String jurusan, String nama, String alamat, int umur, String email) {
        super(nama, alamat, umur, email);
        this.nrp = nrp;
        this.jurusan = jurusan;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + super.toString() + "nrp=" + nrp + ", jurusan=" + jurusan + '}';
    }

    
}
