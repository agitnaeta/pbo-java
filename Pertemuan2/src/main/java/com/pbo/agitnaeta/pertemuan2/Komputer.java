/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.pertemuan2;

/**
 *
 * @author agitnaeta
 */
public class Komputer {
    // Atribut
     String merk;
     String processor;
     int ramGB;
     double layarInci;
     char tipeStorage;  // Contoh: 'H' = HDD, 'S' = SSD
     boolean adaWebcam;
     int tahunRilis;

    // Konstruktor
    public Komputer(String merk, String processor, int ramGB, double layarInci, char tipeStorage, boolean adaWebcam, int tahunRilis) {
        this.merk = merk;
        this.processor = processor;
        this.ramGB = ramGB;
        this.layarInci = layarInci;
        this.tipeStorage = tipeStorage;
        this.adaWebcam = adaWebcam;
        this.tahunRilis = tahunRilis;
    }

    // Method untuk menampilkan info komputer
    public void printInfo() {
        System.out.println("Merk         : " + merk);
        System.out.println("Processor    : " + processor);
        System.out.println("RAM (GB)     : " + ramGB);
        System.out.printf("Layar (inci) : %.1f\n", layarInci);
        System.out.println("Tipe Storage : " + (tipeStorage == 'S' ? "SSD" : "HDD"));
        System.out.println("Ada Webcam   : " + (adaWebcam ? "Ya" : "Tidak"));
        System.out.println("Tahun Rilis  : " + tahunRilis);
        System.out.println("-----------------------------");
    }
}

