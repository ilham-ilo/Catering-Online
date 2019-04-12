/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopingArrayClassDgrm;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class LatihanArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] Nama = {"Ahmad", "Zaky", "William", "Ahmad"};
        String[] Alamat = {"Sragen", "Bdg", "Sumatra", "Cirebon"};
        
        int[] temuan = new int[5];
        int indeksTemuan = 0;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Pencarian Nama Alamat ");
        System.out.print(" Masukkan nama : ");
        
        String queryNama = scan.nextLine();
        
        for (int i = 0; i < Nama.length ; i++){
            if (queryNama.equalsIgnoreCase(Nama[i])){
               temuan[indeksTemuan] = i;
               indeksTemuan++;
            }
        }
        
        System.out.println("Ditemukan " + indeksTemuan+ " Hasil");
        
        for (int i=0 ; i< indeksTemuan ; i++){
            System.out.println("\n " + " Nama : " + Nama[temuan[i]] + "\n Alamat : " + Alamat[temuan[i]]);
        }
        
    }
    
}
