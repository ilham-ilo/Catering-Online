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
public class Dog extends ProfileAnimal implements PetOut, PetInfo {

    public Dog(String nama, String breed) {
        super(nama, breed);
    }
    
    
    @Override
    public void info() {
        System.out.println("info dog");
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + AGE_DOG + '}';
    }

    @Override
    public void sound() {
        System.out.println("gong gong gong gong");
    }
    
    
}
