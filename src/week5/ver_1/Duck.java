/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.ver_1;

import week5.*;

/**
 *
 * @author ACER
 */
public class Duck extends ProfileAnimal implements PetOut {

    public Duck(String nama, String breed) {
        super(nama, breed);
    }
    
   
    @Override
    public void sound() {
        System.out.println("kwek kwek kwek");
    }

    @Override
    public String toString() {
        return "Duck{" + super.toString() +'}';
    }
    
    
}
