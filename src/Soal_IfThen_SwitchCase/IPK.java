/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_IfThen_SwitchCase;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class IPK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double IPK;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Inputkan IPK: ");
        IPK = scan.nextDouble();
        
        if (IPK >= 3.80){
            System.out.println("Summa Cum Laude");
        }
        else if (IPK >= 3.60 && IPK <= 3.79){
            System.out.println("Magna Cum Laude");
        }
        else if(IPK >= 3.40 && IPK <= 3.59){
            System.out.println("Cum Laude");
        }
        else if(IPK >= 3.20 && IPK <= 3.39){
            System.out.println("High Merit");
        }
        else if(IPK >= 3.00 && IPK <= 3.19){
            System.out.println("Merit");
        }
        else{
            System.out.println("IPK kamu burik");
        }
    }
    
}
