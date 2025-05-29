/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.pertemuan2;

import java.util.Scanner;

/**
 *
 * @author agitnaeta
 */
public class Awal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa(); // Buat objek Mahasiswa

        // Input Name
        System.out.print("Masukkan Nama Anda: ");
        mhs.name = scanner.nextLine();

        // Input NPM 
        System.out.print("Masukkan NPM Anda: ");
        mhs.npm = scanner.nextLine();

        // Input Kelas 
        System.out.print("Masukkan Kelas Anda: ");
        mhs.kelas = scanner.nextLine();

        // Input Alamat
        System.out.print("Masukkan Alamat Anda: ");
        mhs.alamat = scanner.nextLine();

        // Input Telepon
        System.out.print("Masukkan Nomor Telepon Anda: ");
        mhs.telepon = scanner.nextLine();

        // Input Tahun Lahir
        System.out.print("Masukkan Tahun Lahir Anda: ");
        mhs.tahunLahir = scanner.nextInt();

        // Tampilkan hasil
        mhs.print();
    }
   
}
