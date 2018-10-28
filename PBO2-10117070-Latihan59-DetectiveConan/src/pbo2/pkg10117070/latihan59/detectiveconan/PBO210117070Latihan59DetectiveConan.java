/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan59.detectiveconan;

/**
 *
 * @author Aditya
 * NAMA                 : Aditya Nur Iskandar
 * KELAS                : PBO2
 * NIM                  : 10117070
 * Deskripsi Program    : Program ini berisi program untuk menampilkan biodata
 * karakter dari detektif conan
 */
public class PBO210117070Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainKarakter conan = new MainKarakter("Investigator", "Menyelesaikan Kasus","Conan Edogawa","Tokyo",true);
        MainKarakter ran = new MainKarakter("Karate", "Sama seperti Shinichi","Ran Mouri","Osaka",false);
        KarakterPendukung eisuke = new KarakterPendukung("Teman Sekelas Ran Mouri","Eisuke Hondo","Osaka",false);
        conan.displayCharacter();
        ran.displayCharacter();
        eisuke.displayCharacter();
    }
    
}
