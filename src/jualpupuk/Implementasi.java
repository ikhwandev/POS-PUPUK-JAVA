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
public class Implementasi extends Abstrak{//implementasi dari class Abstrak

    @Override
    public void aData(String nama,String jalan) {
        System.out.println("BADAN USAHA MILIK DESA " +nama);
        System.out.println("JALAN "+jalan);
    }
    
}
