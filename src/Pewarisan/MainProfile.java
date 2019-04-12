/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class MainProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = setDataMhs();
        Dosen dsn = setDataDsn();
        
        Profile[] myProf = {mhs, dsn};
        for(Profile prof: myProf){
            System.out.println(prof.toString());
        }
    }
    
    private static Mahasiswa setDataMhs(){
        Mahasiswa mhs = new Mahasiswa();
        String nrp, nama, alamat, jurusan, email;
        int umur;
        nrp = JOptionPane.showInputDialog("Masukkan nrp mahasiswa");
        nama = JOptionPane.showInputDialog("Masukkan nama mahasiswa");
        alamat = JOptionPane.showInputDialog("Masukkan alamat mahasiswa");
        jurusan = JOptionPane.showInputDialog("Masukkan jurusan mahasiswa");
        email = JOptionPane.showInputDialog("Masukkan email mahasiswa");
        umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur mahasiswa"));
        
        mhs.setNrp(nrp);
        mhs.setNama(nama);
        mhs.setAlamat(alamat);
        mhs.setJurusan(jurusan);
        mhs.setUmur(umur);
        mhs.setEmail(email);
        
        return mhs;
    }
    
    private static Dosen setDataDsn(){
        String nrp, nama, alamat, email, keahlian;
        int umur;
        
        nrp = JOptionPane.showInputDialog("Masukkan nip dosen");
        nama = JOptionPane.showInputDialog("Masukkan nama dosen");
        alamat = JOptionPane.showInputDialog("Masukkan alamat dosen");
        email = JOptionPane.showInputDialog("Masukkan email dosen");
        keahlian = JOptionPane.showInputDialog("Masukkan keahlian dosen");
        umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur dosen"));
        
        return new Dosen(nrp, keahlian, nama, alamat, umur, email);
    }
    
    
}
