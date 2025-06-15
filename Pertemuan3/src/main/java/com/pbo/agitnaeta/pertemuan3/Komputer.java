/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.pertemuan3;

/**
 *
 * @author agitnaeta
 */

public class Komputer {
    // Atribut
    private String merk;
    private String processor;
    private int ramGB;
    private double layarInci;
    private char tipeStorage;  // Contoh: 'H' = HDD, 'S' = SSD
    private boolean adaWebcam;
    private int tahunRilis;

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

    // Getter methods
    public String getMerk() {
        return merk;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRamGB() {
        return ramGB;
    }

    public double getLayarInci() {
        return layarInci;
    }

    public char getTipeStorage() {
        return tipeStorage;
    }

    public boolean isAdaWebcam() {
        return adaWebcam;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

    // Setter methods
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    public void setLayarInci(double layarInci) {
        this.layarInci = layarInci;
    }

    public void setTipeStorage(char tipeStorage) {
        this.tipeStorage = tipeStorage;
    }

    public void setAdaWebcam(boolean adaWebcam) {
        this.adaWebcam = adaWebcam;
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    // Method untuk menampilkan info komputer menggunakan getters
    public void printInfo() {
        System.out.println("Merk         : " + getMerk());
        System.out.println("Processor    : " + getProcessor());
        System.out.println("RAM (GB)     : " + getRamGB());
        System.out.printf("Layar (inci) : %.1f\n", getLayarInci());
        System.out.println("Tipe Storage : " + (getTipeStorage() == 'S' ? "SSD" : "HDD"));
        System.out.println("Ada Webcam   : " + (isAdaWebcam() ? "Ya" : "Tidak"));
        System.out.println("Tahun Rilis  : " + getTahunRilis());
        System.out.println("-----------------------------");
    }
}


