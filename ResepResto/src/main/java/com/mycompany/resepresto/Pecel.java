/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resepresto;

/**
 *
 * @author macos
 */

    class Pecel extends ResepResto {
   final private String bumbuHalus;

  
    public Pecel(String bahanUtama, String caraMembuat, String bumbuHalus, String _ruas_kencur, String _sdm_air_asam_jawa_12_sdt_garam_2_sdm_gul) {
        super(bahanUtama, caraMembuat);
        this.bumbuHalus = bumbuHalus;
    }

   
    @Override
    public void infoResepResto() {
        super.infoResepResto();
        System.out.println("Bumbu Halus: " + bumbuHalus);
    }
}

    
