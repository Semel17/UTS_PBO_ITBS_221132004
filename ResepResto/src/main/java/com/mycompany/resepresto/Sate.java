/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resepresto;

/**
 *
 * @author macos
 */
    class Sate extends ResepResto {
   final private String bumbuHalus;
   final private String bahanSambal;
   final private String bahanPelengkap;

   
    public Sate(String bahanUtama, String caraMembuat, String bumbuHalus, String bahanSambal, String bahanPelengkap) {
        super(bahanUtama, caraMembuat);
        this.bumbuHalus = bumbuHalus;
        this.bahanSambal = bahanSambal;
        this.bahanPelengkap = bahanPelengkap;
    }
    
}
