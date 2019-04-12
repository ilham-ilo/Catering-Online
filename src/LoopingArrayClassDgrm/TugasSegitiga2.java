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
public class TugasSegitiga2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=5;i>=1;i--){//outer loop
            for(int j=5;j>i;j--){//inner loop 1
                System.out.print(" ");//untuk spasi samping ke kiri
            }
            for(int k=1;k<(i*2);k++){//inner loop 2
                System.out.print(k);//untuk membentuk pola barisan angka segitiga atau piramida ke bawah
            }
        System.out.println();//untuk spasi ke bawah
        }
    }   
}

