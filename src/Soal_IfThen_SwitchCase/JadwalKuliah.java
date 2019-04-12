/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_IfThen_SwitchCase;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class JadwalKuliah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String hari;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Inputkan nama hari: ");
        hari = scan.nextLine();
        
        switch(hari){
            case "senin":
                System.out.println("matematika");
                break;
            case "selasa":
                System.out.println("b.indonesia");
                break;
            case "rabu":
                System.out.println("b.inggris");
                break;
            case "kamis":
                System.out.println("ipa");
                break;
            case "jumat":
                System.out.println("ips");
                break;
            case "sabtu":
                System.out.println("libur");
                break;
            case "minggu":
                System.out.println("libur lagi gan");
                break;
            default:
                System.out.println("input nama hari!");
        }
    }
}
    

