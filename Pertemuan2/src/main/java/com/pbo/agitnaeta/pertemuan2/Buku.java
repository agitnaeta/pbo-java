/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.pertemuan2;

/**
 *
 * @author agitnaeta
 */
public class Buku {
    // Atribut
     String judul;
     String penulis;
     int tahunTerbit;
     double harga;
     boolean tersedia;  // true = tersedia, false = tidak tersedia

    // Konstruktor
    public Buku(String judul, String penulis, int tahunTerbit, double harga, boolean tersedia) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.tersedia = tersedia;
    }

    // Method untuk menampilkan info buku
    public void printInfo() {
        System.out.println("Judul       : " + judul);
        System.out.println("Penulis     : " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.printf("Harga       : Rp %.2f\n", harga);
        System.out.println("Tersedia    : " + (tersedia ? "Ya" : "Tidak"));
        System.out.println("---------------------------");
    }
}

