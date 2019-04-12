/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfism;

/**
 *
 * @author ACER
 */
public class Segitiga extends BangunDatar {
    
    public void bentuk(){
        System.out.println("Bentuk Segitiga");
        int tinggi = 3;
        int lebar = 3;
        for (int i = 0; i<lebar; i++){
            for (int j=0; j<=i; j++){
                System.out.print(" * ");    
            }
        System.out.println("");
        }
    }
    
    public String over(String s){
        return s;
    }
}
