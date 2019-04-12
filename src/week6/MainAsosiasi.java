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
public class MainAsosiasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MataKuliah mtk1 = new MataKuliah("IFA-101", "PTI", 2, "A");
        MataKuliah mtk2 = new MataKuliah("IFA-102", "MTK", 3, "A");
        MataKuliah mtk3 = new MataKuliah("IFA-102", "IPA", 4, "A");
        MataKuliah mtk4 = new MataKuliah("IFA-201", "IPS", 3, "A");
        MataKuliah mtk5 = new MataKuliah("IFA-202", "SBK", 2, "A");
        MataKuliah mtk6 = new MataKuliah("IFA-203", "TIK", 4, "A");
        
        String[] lstMkMhs1 = {"IFA-101", "IFA-103", "IFA-202"};
        String[] lstMkMhs2 = {"IFA-101", "IFA-203", "IFA-202"};
        String[] lstMkMhs3 = {"IFA-102", "IFA-103", "IFA-201", "IFA-203"};
        
        Mahasiswa mhs1 = new Mahasiswa("152017041", "Abdullah", 16);
        mhs1.setListKodeMk(lstMkMhs1);
        Mahasiswa mhs2 = new Mahasiswa("152017042", "Dudeman", 17);
        mhs2.setListKodeMk(lstMkMhs2);
        Mahasiswa mhs3 = new Mahasiswa("152017043", "Clarah", 18);
        mhs3.setListKodeMk(lstMkMhs3);
        Mahasiswa mhs4 = new Mahasiswa("152017044", "Downy", 15);
        Mahasiswa[] lstMhs = {mhs1, mhs2, mhs3, mhs4};
        MataKuliah[] lstMtk = {mtk1, mtk2, mtk3, mtk4, mtk5, mtk6};
        
        for (Mahasiswa mhs : lstMhs){
            System.out.println(mhs);
            String[] myKodeMk = mhs.getListKodeMk();
            System.out.println("Panjang: " + myKodeMk.length);
            System.out.println("Mata kuliah yang diambil mhs: ");
            for (String kodeMk : myKodeMk){
                for (MataKuliah mtk : lstMtk){
                    System.out.println(mtk);
                }
            }
        }
    }  
}
