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
public class Dosen extends Profile{
    private String nip;
    private String keahlian;

    public Dosen() {
    }

    public Dosen(String nip, String keahlian, String nama, String alamat, int umur, String email) {
        super(nama, alamat, umur, email);
        this.nip = nip;
        this.keahlian = keahlian;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }

    @Override
    public String toString() {
        return "Dosen{" + super.toString() + "nip=" + nip + ", keahlian=" + keahlian + '}';
    }
    
    
    
}
