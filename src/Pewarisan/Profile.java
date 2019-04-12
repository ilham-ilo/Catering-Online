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
public class Profile {
    private String nama;
    private String alamat;
    private int umur;
    private String email;

    public Profile() {
    }

    public Profile(String nama, String alamat, int umur, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Profile{" + "nama=" + nama + ", alamat=" + alamat + ", umur=" + umur + ", email=" + email + '}';
    }
    
    
}
