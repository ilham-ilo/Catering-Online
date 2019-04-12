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
public class Peminjam extends Kamera implements SewaKamera {
    
     public String Nama;
    public int No_Id;
    public String Jenis_Id;
    
    public Peminjam() {
    }

    public Peminjam(String Nama, int No_Id, String Jenis_Id, String Nama_Kamera, int Id_Kamera, int Harga, int Jumlah) {
        super(Nama_Kamera, Id_Kamera, Harga, Jumlah);
        this.Nama = Nama;
        this.No_Id = No_Id;
        this.Jenis_Id = Jenis_Id;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getNo_Id() {
        return No_Id;
    }

    public void setNo_Id(int No_Id) {
        this.No_Id = No_Id;
    }

    public String getJenis_Id() {
        return Jenis_Id;
    }

    public void setJenis_Id(String Jenis_Id) {
        this.Jenis_Id = Jenis_Id;
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
        return "Peminjam{" + "Nama=" + Nama + ", No_Id=" + No_Id + ", Jenis_Id=" + Jenis_Id + '}';
    }

    
  public int biaya(){
      return (harga*this.Jumlah)+100;
    }
    
    
}
