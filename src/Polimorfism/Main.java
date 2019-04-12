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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    BangunDatar b = new BangunDatar();
    Persegi p = new Persegi();
    Segitiga s = new Segitiga();
    b.bentuk();
    b = p;
    b.bentuk();
    b = s;
    b.bentuk();
    System.out.println(p.over());
    System.out.println(s.over("ini parameter berbeda"));
    }
    
}
