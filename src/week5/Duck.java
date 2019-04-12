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
public class Duck implements PetOut {
    
    private String nama;
    private String breed;

    public Duck() {
    }

    public Duck(String nama, String breed) {
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
        System.out.println("kwek kwek kwek");
    }

    @Override
    public String toString() {
        return "Duck{" + "nama=" + nama + ", breed=" + breed + AGE_DUCK +'}';
    }
    
    
}
