/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resepresto;

/**
 *
 * @author macos
 */
public class ResepResto {

  protected String bahanUtama;
    protected String caraMembuat;
    public ResepResto(String bahanUtama, String caraMembuat) {
        this.bahanUtama = bahanUtama;
        this.caraMembuat = caraMembuat;
    }
    
    public void infoResepResto() {
        System.out.println("Bahan Utama: " + bahanUtama);
        System.out.println("Cara Membuat: " + caraMembuat);
    }
}
