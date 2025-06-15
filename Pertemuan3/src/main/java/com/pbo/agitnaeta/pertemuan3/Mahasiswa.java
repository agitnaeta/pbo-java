package com.pbo.agitnaeta.pertemuan3;

import java.time.Year;

public class Mahasiswa {
    private String name;
    private String npm;
    private String kelas;
    private String alamat;
    private String telepon;
    private int tahunLahir;

    // Konstruktor default
    public Mahasiswa() {
        this.name = "-";
        this.npm = "0";
        this.kelas = "-";
        this.alamat = "-";
        this.telepon = "-";
        this.tahunLahir = 0;
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String name, String npm, String kelas, String alamat, String telepon, int tahunLahir) {
        this.name = name;
        this.npm = npm;
        this.kelas = kelas;
        this.alamat = alamat;
        this.telepon = telepon;
        this.tahunLahir = tahunLahir;
    }

    // Getter dan Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    // Fungsi untuk menghitung umur
    public int hitungUmur() {
        int tahunSekarang = Year.now().getValue();
        return tahunSekarang - this.tahunLahir;
    }

    // Method untuk mencetak data mahasiswa
    public void print() {
        System.out.println("\n--- Info Mahasiswa ---");
        System.out.println("Nama        : " + name);
        System.out.println("NPM         : " + npm);
        System.out.println("Kelas       : " + kelas);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Telepon     : " + telepon);
        System.out.println("Umur        : " + hitungUmur() + " tahun");
    }
}
