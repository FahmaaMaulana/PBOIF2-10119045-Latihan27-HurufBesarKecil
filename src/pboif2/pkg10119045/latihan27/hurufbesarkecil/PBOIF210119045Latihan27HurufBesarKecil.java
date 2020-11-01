/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119045.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author Legion
 * NAMA                 : Fahma Maulana
 * KELAS                : PBOIF2
 * NIM                  : 10119045
 * Deskripsi Program    : Huruf Besar Kecil
 */
public class PBOIF210119045Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Masukan Kalimat : ");
        kalimat = scanner.nextLine();
        
        String hurufBesar = kalimat.toUpperCase();
        String hurufKecil = kalimat.toLowerCase();
        
          System.out.println("----- Hasil Formatting -----");
          
        System.out.println("String awal: " + kalimat);  
        System.out.println("String huruf Besar : " + hurufBesar);
        System.out.println("String huruf Kecil : " + hurufKecil);
        
        System.out.println("-----------------------------");
        System.out.println("Developed bye : Fahma Maulana");
    }
    
}
