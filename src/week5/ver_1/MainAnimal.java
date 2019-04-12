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
public class MainAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Duck duck = new Duck("Angsa", "Lokal");
        Cat cat =  new Cat("Dude", "Cikajang");
        Dog dog = new Dog("Mahesa", "Bali");
        Spaniel spaniel = new Spaniel("Herder", "Toy", "Bandung");
        
        ProfileAnimal[] myAnimal = {duck, cat, dog, spaniel};
        for (ProfileAnimal animal : myAnimal){
            System.out.println(animal);
            System.out.println("Sound :: ");
            animal.sound();
        }
        
        PetInfo[] animalInfo = {dog, spaniel};
        for (PetInfo animal : animalInfo){
            System.out.println(animal);
            animal.info();
        }
    }
    
}
