package com.pbo.agitnaeta.pertemuan2;

import java.util.Scanner;
import java.time.Year;

/**
 *
 * @author agitnaeta
 */
public class Mahasiswa {
    String name;
    String npm;
    String kelas;
    String alamat;
    String telepon;
    int tahunLahir;

    // Method untuk mencetak data mahasiswa
    public void print() {
        int tahunSekarang = Year.now().getValue(); // Mendapatkan tahun saat ini
        int umur = tahunSekarang - tahunLahir;

        System.out.println("\n--- Info Mahasiswa ---");
        System.out.println("Nama        : " + name);
        System.out.println("NPM         : " + npm);
        System.out.println("Kelas       : " + kelas);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Telepon     : " + telepon);
        System.out.println("Umur        : " + umur + " tahun");
    }
}
