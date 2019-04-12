/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.ver_1;

/**
 *
 * @author ACER
 */
public abstract class ProfileAnimal {
    
    private String nama;
    private String breed;

    public ProfileAnimal() {
    }

    public ProfileAnimal(String nama, String breed) {
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
    
    public abstract void sound();

    @Override
    public String toString() {
        return "ProfileAnimal{" + "nama=" + nama + ", breed=" + breed + '}';
    }
      
    
}
