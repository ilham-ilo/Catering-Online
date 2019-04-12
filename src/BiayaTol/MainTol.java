/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiayaTol;

/**
 *
 * @author ACER
 */
public class MainTol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tol t = new Tol("Tol Pantura","Tol Suramadu");
        Tol_Pantura tp = new Tol_Pantura("10000");
        Tol_Suramadu ts = new Tol_Suramadu("20000");
        t.informasi();
        tp.inform();
        ts.informasi();
        
    }
    
}
