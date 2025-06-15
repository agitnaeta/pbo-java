package com.pbo.agitnaeta.program1;

import java.util.Scanner;

/**
 *
 * @author agitnaeta
 * @npm 2024210052
 */
public class KalkulasiPembelian {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Masukkan harga satuan barang: ");
        double harga = scanner.nextDouble();

        System.out.print("Masukkan jumlah barang: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Apakah pembeli adalah distributor? (y/n): ");
        String inputDistributor = scanner.nextLine();
        boolean isDistributor = inputDistributor.trim().toLowerCase().equals("y");



        // Hitung total harga
        double totalHarga = harga * jumlah;
        double diskon = 0;

        // Tentukan diskon
        if (isDistributor) {
            diskon = 0.25;
        } else {
            if (totalHarga >= 10000000) {
                diskon = 0.20;
            } else if (totalHarga >= 7000000) {
                diskon = 0.15;
            } else if (totalHarga >= 5000000) {
                diskon = 0.10;
            }
        }

        double jumlahDiskon = totalHarga * diskon;
        double totalBayar = totalHarga - jumlahDiskon;

        // Tampilkan hasil
        printResult(namaBarang, harga, jumlah, diskon, totalHarga, jumlahDiskon, totalBayar);
    }

    public static void printResult(String namaBarang, double harga, int jumlah, double diskon, double totalHarga, double jumlahDiskon, double totalBayar) {
        System.out.println("\n========== STRUK PEMBELIAN ==========");
        System.out.printf("Barang\t\t: %s\n", namaBarang);
        System.out.printf("Harga Satuan\t: Rp%,.0f\n", harga);
        System.out.printf("Jumlah\t\t: %d\n", jumlah);
        System.out.printf("Total Harga\t: Rp%,.0f\n", totalHarga);
        System.out.printf("Diskon\t\t: %.0f%% = Rp%,.0f\n", diskon * 100, jumlahDiskon);
        System.out.println("-------------------------------------");
        System.out.printf("Total Bayar\t: Rp%,.0f\n", totalBayar);
        System.out.println("=====================================");
    }
}
