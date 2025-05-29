package com.pbo.agitnaeta.program1;

import java.util.Scanner;

/**
 * Program utama untuk memilih dan menjalankan salah satu dari beberapa latihan.
 * Pengguna diminta untuk memasukkan nomor program latihan yang ingin dijalankan.
 * 
 * Daftar program latihan:
 * 1. Data Mahasiswa
 * 2. Tarif Sewa
 * 3. Kalkulasi Pembelian
 * 4. Fotocopy
 * 5. Segitiga
 * 6. Tabel dengan Continue
 * 7. Bilangan Prima
 * 8. Hitung Seluruh Bilangan
 * 
 * @author agitnaeta
 */
public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Daftar Program Latihan:");
        System.out.println("1. Latihan 1 - Mahasiswa");
        System.out.println("2. Latihan 2 - Tarif Sewa");
        System.out.println("3. Latihan 3 - Kalkulasi Pembelian");
        System.out.println("4. Latihan 4 - Fotocopy");
        System.out.println("5. Latihan 5 - Segitiga");             
        System.out.println("6. Latihan 6 - Tabel dengan Continue");
        System.out.println("7. Latihan 7 - Bilangan Prima");
        System.out.println("8. Latihan 8 - Hitung Seluruh Bilangan");
        System.out.print("Masukkan Nomor Program: ");
       
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                DataMahaSiswa.main(new String[]{}); // Menjalankan program Latihan 1: Mahasiswa
                break;
            case 2:
                TarifSewa.main(new String[]{}); // Menjalankan program Latihan 2: Tarif Sewa
                break;
            case 3:
                KalkulasiPembelian.main(new String[]{}); // Menjalankan program Latihan 3: Kalkulasi Pembelian
                break;
            case 4:
                FotoCopy.main(new String[]{}); // Menjalankan program Latihan 4: Fotocopy
                break;
            case 5:
                SegiTiga.main(new String[]{}); // Menjalankan program Latihan 5: Segitiga
                break;
            case 6:
                TableContinue.main(new String[]{}); // Menjalankan program Latihan 6: Tabel dengan Continue
                break;
            case 7:
                BilanganPrima.main(new String[]{}); // Menjalankan program Latihan 7: Bilangan Prima
                break;
            case 8:
                HitungSeluruhBilangan.main(new String[]{}); // Menjalankan program Latihan 8: Hitung Seluruh Bilangan
                break;
            default:
                System.out.println("Tidak ada input valid.");
        }
    }
}
