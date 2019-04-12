/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relasi.Komposisi;

/**
 *
 * @author ACER
 */
public class Komputer {
   private String merk;
   private String tipe;
   private Mouse mouse;
   private Keyboard keyboard;
   private Cpu cpu;

    public Komputer(String merk, String tipe, Mouse mouse, Keyboard keyboard, Cpu cpu) {
        this.merk = merk;
        this.tipe = tipe;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.cpu = cpu;
    }
   
}
