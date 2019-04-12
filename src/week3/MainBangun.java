/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author ACER
 */
public class MainBangun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Kubus kbs = new Kubus(10);
        Balok blk = new Balok(10, 8, 5);
        Bangun[] myBg = {kbs, blk};
        
        for(Bangun bgn: myBg){
        System.out.println(bgn);
        }
    }
}

























