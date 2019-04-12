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
public class MainAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Duck duck = new Duck("Angsa", "Cirebon");
        Cat cat =  new Cat("Si manis", "Angora");
        Dog dog = new Dog("Si hitam", "Ciwawa");
        
        ProfileAnimal[] myAnimal = {duck, cat, dog};
        for (ProfileAnimal animal : myAnimal){
            System.out.println(animal);
            animal.sound();
        }
        
    }
    
}
