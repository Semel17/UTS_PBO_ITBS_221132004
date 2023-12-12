/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resepresto;

/**
 *
 * @author macos
 */
public class main {
    public class Main {
    public static void main(String[] args) {
     
        MieKocok mieKocok = new MieKocok("Mie Lebar", "Rendam mie dan taoge hingga lemas, tiriskan.", "1500 cc air", "4 siung bawang putih, haluskan", "Sambal cabai rawit - Kecap irisan cabai dan tomat Kacang", "Kerupuk merah, Kecap manis dan cuka, secukupnya");
        mieKocok.infoResepResto();

        System.out.println(); 

       
        Pecel pecel = new Pecel("Sayuran (kangkung, kol, labu siam, kacang panjang, nangka muda, taoge, kentang rebus)", "Rebus sayuran dan sajikan dengan kentang rebus.", "5 buah cabai merah", "1 ruas kencur", "1 sdm air asam jawa 1/2 sdt garam 2 sdm gula merah 1/2 sdt terasi");
        pecel.infoResepResto();

        System.out.println(); 

      
        Sate sate = new Sate("500 gr daging sapi, dipotong", "Tusuk sate dan bakar di bara api.", "2 sdm asam jawa", "Sambal cabai rawit - Kecap irisan cabai dan tomat Kacang", "Kerupuk merah, Kecap manis dan cuka, secukupnya");
        sate.infoResepResto();
    }
}
    
}
