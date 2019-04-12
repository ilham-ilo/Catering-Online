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
public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;
    private String grade;

    public MataKuliah() {
    }

    public MataKuliah(String kode, String nama, int sks, String grade) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.grade = grade;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "MataKuliah{" + "kode=" + kode + ", nama=" + nama + ", sks=" + sks + ", grade=" + grade + '}';
    }
    
    
    
}
