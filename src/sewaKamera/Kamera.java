/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sewaKamera;

/**
 *
 * @author ACER
 */
public class Kamera {
    
    public String Nama_Kamera;
    public int Id_Kamera;
    public int Jumlah;

    public Kamera() {
    }

    public Kamera(String Nama_Kamera, int Id_Kamera, int Harga, int Jumlah) {
        this.Nama_Kamera = Nama_Kamera;
        this.Id_Kamera = Id_Kamera;
        this.Jumlah = Jumlah;
    }

    public String getNama_Kamera() {
        return Nama_Kamera;
    }

    public void setNama_Kamera(String Nama_Kamera) {
        this.Nama_Kamera = Nama_Kamera;
    }

    public int getId_Kamera() {
        return Id_Kamera;
    }

    public void setId_Kamera(int Id_Kamera) {
        this.Id_Kamera = Id_Kamera;
    }

   
    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int Jumlah) {
        this.Jumlah = Jumlah;
    }

    @Override
    public String toString() {
        return "Kamera{" + "Nama_Kamera=" + Nama_Kamera + ", Id_Kamera=" + Id_Kamera + ", Jumlah=" + Jumlah + '}';
    }
    
}
