/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author ACER
 */
public class MainArrayInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arrInt = new int[5];
        arrInt[0] = 10;
        arrInt[1] = 9;
        arrInt[2] = 8;
        arrInt[3] = 7;
        arrInt[4] = 6;
        
        for(int i=0; i<arrInt.length; i++){
            System.out.println("Elemen ke-" + (i+1) + " = " + arrInt[i]);
        }
        
    }
    
}
