/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.pertemuan3;

/**
 *
 * @author agitnaeta
 */
public class Matakuliah {
    // Atribut
    private String kode;       
    private String nama;       
    private int sks;           
    private double nilaiAkhir; 
    private char grade;        

    // Konstruktor
    public Matakuliah(String kode, String nama, int sks, double nilaiAkhir, char grade) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.nilaiAkhir = nilaiAkhir;
        this.grade = grade;
    }

    // Getter methods
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public char getGrade() {
        return grade;
    }

    // Setter methods
    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    // Method untuk menampilkan info matakuliah menggunakan getters
    public void printInfo() {
        System.out.println("Kode       : " + getKode());
        System.out.println("Nama       : " + getNama());
        System.out.println("SKS        : " + getSks());
        System.out.println("Nilai Akhir: " + getNilaiAkhir());
        System.out.println("Grade      : " + getGrade());
        System.out.println("-----------------------------");
    }
}
