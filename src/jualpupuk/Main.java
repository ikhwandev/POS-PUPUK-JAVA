/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jualpupuk;

import java.util.Scanner;

/**
 *
 * @author ACERE1
 */
public class Main{
    public String nama;
    public String berat;
    
    //konstruktor
    public Main (){
        System.out.println("PUPUK INDONESIA");
    }
    
    //Overloading
    public void setNama(String oldnama){
        nama = oldnama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public static void main(String[] args) {
        
        Implementasi im = new Implementasi();//Membuat objek baru
        String nama = "KALIMALANG";
        String jalan = "PANGLIMA SUDIRMAN NO.1 LAMONGAN";
        
        im.aAbstrak();//panggil method abstrak
        im.aData(nama, jalan);//implementasi dari abstrak class
        
        System.out.println("----------------------------");
        System.out.println("---------JENIS PUPUK--------");
        //Interface
        Urea a = new Urea();
        a.nama();
        a.berat();
        a.komposisi();
        
        NPK b = new NPK();
        b.nama();
        b.berat();
        b.komposisi();
        
        Scanner input = new Scanner (System.in);
        //Konstruktor
        Main ma = new Main();
        //Panggil Overriding
        Overriding c = new Overriding();
        System.out.print("Masukkan Nama PUPUK = ");
        c.nama(input.nextLine());
        Overriding d = new pupuk1();
        System.out.print("Masukkan Nama PUPUK = ");
        d.nama(input.nextLine()); 
        //Overloading
        Main e = new Main();
        System.out.println("Masukkan Nama PUPUK : ");
        e.setNama(input.nextLine());
        System.out.println("Nama pupuk\t: "+ e.getNama()); 
        //Inheritance
        Inheritance f = new Inheritance();
        f.nama();
    }
}
