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
public class MainAgregasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa("152017041", "Budi", "Cikajang", 16);
        Mahasiswa mhs2 = new Mahasiswa("152017042", "Ujang", "Cikajang", 17);
        Mahasiswa mhs3 = new Mahasiswa("152017043", "Galih", "Cikajang", 18);
        Mahasiswa mhs4 = new Mahasiswa("152017044", "Bambang", "Cikajang", 19);
        Mahasiswa mhs5 = new Mahasiswa("152017045", "Jokovvi", "Cikajang", 18);
        Mahasiswa mhs6 = new Mahasiswa("152017046", "Prabovvo", "Cikajang", 17);
        
        Mahasiswa[] mhsBimb1 = {mhs1, mhs3, mhs6};
        Mahasiswa[] mhsBimb2 = {mhs2, mhs4, mhs5};
        Dosen dsn1 = new Dosen("1515", "Bujang", "Peternakan");
        dsn1.setLstBimbingan(mhsBimb1);
        Dosen dsn2 = new Dosen("1516", "Kutil", "Kedokteran");
        dsn2.setLstBimbingan(mhsBimb2);
        Dosen[] lstDsn = {dsn1, dsn2};
        
        for (Dosen dsn : lstDsn){
            System.out.println(dsn);
            System.out.println("Mahasiswa Bimbingan: ");
            Mahasiswa[] myMhs = dsn.getLstBimbingan();
            for (Mahasiswa mhs : myMhs)
                System.out.println(mhs);
        }
                
        
        
    }
    
}
