/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author ACER
 */
public class Dog implements PetOut, PetInfo {
    
    private String nama;
    private String breed;

    public Dog() {
    }

    public Dog(String nama, String breed) {
        this.nama = nama;
        this.breed = breed;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    @Override
    public void sound() {
        System.out.println("gong gong gong gong");  
    }

    @Override
    public void info() {
        System.out.println("info dog");
    }

    @Override
    public String toString() {
        return "Dog{" + "nama=" + nama + ", breed=" + breed + AGE_DOG + '}';
    }
    
    
}
