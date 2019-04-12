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
public class TugasSegitiga3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=1;//inisialisasi nilai pada variable a=1 untuk angka awal
        for (int i = 0; i < 4; i++){//outer loop
            for (int j=0;j<=i;j++){//inner loop
                System.out.print(a+" ");//mencetak nilai pada variable a
                a++;//proses increement pada nilai di variable a
            }
            System.out.println("");//untuk membuat spasi ke bawah atau mengakhiri baris untuk membentuk segitiga
        }
    } 
}

