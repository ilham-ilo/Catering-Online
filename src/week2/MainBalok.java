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
public class MainBalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Balok blk1 = new Balok();
        Balok blk2 = new Balok(7.8);
        Balok blk3 = new Balok(7.8, 6.5);
        Balok blk4 = new Balok(7.8, 6.5, 7);
        Balok blk5 = new Balok(7, 6, 4);
        
        System.out.println(blk1.toString());
        System.out.println(blk2.toString());
        System.out.println(blk3.toString());
        System.out.println(blk4.toString());
        System.out.println(blk5.toString());
        
        System.out.println("Volume blk1 = " + blk1.volume());
        System.out.println("Volume blk2 = " + blk2.volume());
        System.out.println("Volume blk3 = " + blk3.volume());
        System.out.println("Volume blk4 = " + blk4.volume());
        System.out.println("Volume blk5 = " + blk5.volume());
        
        System.out.println("Volume blk5 = " + blk5.volume(8.5));
        System.out.println("Volume blk5 = " + blk5.volume(8));
        System.out.println("Volume blk5 = " + blk5.volume(8.5, 7));
    
    }
    
}
