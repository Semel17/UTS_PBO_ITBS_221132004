/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resepresto;

/**
 *
 * @author macos
 */
    class MieKocok extends ResepResto {
    final private String bahanKuah;
    final private String bumbuHalus;
    final private String bahanSambal;
    final private String bahanPelengkap;


    public MieKocok(String bahanUtama, String caraMembuat, String bahanKuah, String bumbuHalus, String bahanSambal, String bahanPelengkap) {
        super(bahanUtama, caraMembuat);
        this.bahanKuah = bahanKuah;
        this.bumbuHalus = bumbuHalus;
        this.bahanSambal = bahanSambal;
        this.bahanPelengkap = bahanPelengkap;
    }

    
    @Override
    public void infoResepResto() {
        super.infoResepResto();
        System.out.println("Bahan Kuah: " + bahanKuah);
        System.out.println("Bumbu Halus: " + bumbuHalus);
        System.out.println("Bahan Sambal: " + bahanSambal);
        System.out.println("Bahan Pelengkap: " + bahanPelengkap);
    }
}


