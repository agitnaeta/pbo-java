/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.pertemuan2;

/**
 *
 * @author agitnaeta
 */
public class Matakuliah {
    // Atribut
    private String kode;       // Contoh: "IF101"
    private String nama;       // Contoh: "Pemrograman Dasar"
    private int sks;           // Contoh: 3
    private double nilaiAkhir; // Contoh: 85.5
    private char grade;        // Contoh: 'A'

    // Konstruktor
    public Matakuliah(String kode, String nama, int sks, double nilaiAkhir, char grade) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.nilaiAkhir = nilaiAkhir;
        this.grade = grade;
    }

    // Method untuk menampilkan info matakuliah
    public void printInfo() {
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Grade      : " + grade);
        System.out.println("-----------------------------");
    }
}

