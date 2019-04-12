/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopingArrayClassDgrm;

/**
 *
 * @author ACER
 */
public class TugasSegitiga1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=1; i<=6; i++){ //outer loop dan perulangan luar
           for (int j=1; j<=i; j++){ //inner loop dan perulangan dalam
               System.out.print(j+" ");//digunakan untuk menampilkan nilai angka variable j
           }
           System.out.println(" ");//menambah spasi ke bawah untuk membentuk pola segitiga
       }
    }
}
