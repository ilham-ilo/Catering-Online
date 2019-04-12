/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract_Interface;

/**
 *
 * @author ACER
 */
public abstract class Manusia {
    
   int tinggi;
   
   public void gender(){
       System.out.println("L/P: ");
   }
   
   public void tinggi(){
       System.out.println("Tinggi: " + tinggi + " cm");
   }
   
   abstract void nama();
   
}
