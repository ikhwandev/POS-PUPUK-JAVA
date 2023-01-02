/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jualpupuk;

/**
 *
 * @author ACERE1
 */
public class NPK implements pupuk{

    @Override
    public void nama() {
        System.out.println("===PUPUK NPK===");
    }

    @Override
    public void berat() {
        System.out.println("Berat Isi 50 KG");
    }

    @Override
    public void komposisi() {
        System.out.println("Nitrogen 16%");
        System.out.println("Kalium 0,5%");
        System.out.println("Calcium 0,6%");
    }
    
}
