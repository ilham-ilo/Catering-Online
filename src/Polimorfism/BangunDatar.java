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
public class BangunDatar {
    
    public void bentuk(){
        System.out.println("Bentuk Persegi");
    }
    
    public String over(){
        return "ini berasal dari kelas parent";
    }
    
    public String over(String s){
        return "ini parameter berbeda";
    }
   
}
