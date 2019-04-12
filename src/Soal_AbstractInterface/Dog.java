/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_AbstractInterface;

/**
 *
 * @author ACER
 */
public class Dog extends ProfileAnimal implements PetOut{
    
    public Dog(String nama, String breed) {
        super(nama, breed);
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + AGE_DOG + '}';
    }

    @Override
    public void sound() {
        System.out.println("gok gok gok");
    }
}
