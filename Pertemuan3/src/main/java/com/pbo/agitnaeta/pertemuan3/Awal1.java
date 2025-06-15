package com.pbo.agitnaeta.pertemuan3;

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
        mhs.setName(scanner.nextLine());

        // Input NPM 
        System.out.print("Masukkan NPM Anda: ");
        mhs.setNpm(scanner.nextLine());

        // Input Kelas 
        System.out.print("Masukkan Kelas Anda: ");
        mhs.setKelas(scanner.nextLine());

        // Input Alamat
        System.out.print("Masukkan Alamat Anda: ");
        mhs.setAlamat(scanner.nextLine());

        // Input Telepon
        System.out.print("Masukkan Nomor Telepon Anda: ");
        mhs.setTelepon(scanner.nextLine());

        // Input Tahun Lahir
        System.out.print("Masukkan Tahun Lahir Anda: ");
        mhs.setTahunLahir(scanner.nextInt());

        // Tampilkan hasil
        mhs.print();

        scanner.close(); // Tutup scanner
        
        // Sample penggunaan constructor
        Mahasiswa mhsDefault = new Mahasiswa();
        Mahasiswa mhs1 = new Mahasiswa("Siti Aminah", "22111001", "IF-A", "Bandung", "081234567001", 2001);
        Mahasiswa mhs2 = new Mahasiswa("Rudi Hartono", "22111002", "IF-B", "Jakarta", "081234567002", 2000);
        Mahasiswa mhs3 = new Mahasiswa("Dewi Lestari", "22111003", "IF-C", "Surabaya", "081234567003", 1999);

        mhsDefault.print();
        mhs1.print();
        mhs2.print();
        mhs3.print();
    }
}
