/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.pertemuan3;

/**
 *
 * @author agitnaeta
 */
public class Buku {
    // Atribut
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private double harga;
    private boolean tersedia;  // true = tersedia, false = tidak tersedia

    // Konstruktor
    public Buku(String judul, String penulis, int tahunTerbit, double harga, boolean tersedia) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.tersedia = tersedia;
    }

    // Getter methods
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public double getHarga() {
        return harga;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    // Setter methods
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    // Method untuk menampilkan info buku menggunakan getters
    public void printInfo() {
        System.out.println("Judul       : " + getJudul());
        System.out.println("Penulis     : " + getPenulis());
        System.out.println("Tahun Terbit: " + getTahunTerbit());
        System.out.printf("Harga       : Rp %.2f\n", getHarga());
        System.out.println("Tersedia    : " + (isTersedia() ? "Ya" : "Tidak"));
        System.out.println("---------------------------");
    }
}


