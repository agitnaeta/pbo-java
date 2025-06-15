/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.program1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
/**
 * @author agitnaeta
 * @npm 2024210052
 */


public class HitungSeluruhBilangan {
    public static void main(String[] args) {
       
        // untuk input
        Scanner scanner = new Scanner(System.in);
        
        
        // list tampungan
        List<Double> bilangan = new ArrayList<>();

        System.out.println("Masukkan angka (ketik 'n' untuk selesai):");

        while (true) {
            System.out.print("Input: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("n")) {
                break; // keluar dari loop jika input = 'n'
            }

            try {
                double nilai = Double.parseDouble(input);
                bilangan.add(nilai);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid, masukkan angka atau 'n' untuk selesai.");
            }
        }

        double total = 0;
        for (double angka : bilangan) {
            total += angka;
        }
        
        int jumlahData = bilangan.size();
        double average = total / jumlahData;
        Collections.sort(bilangan);
        
        double min = bilangan.getFirst();
        double max = bilangan.getLast();
        

        System.out.printf("Jumlah semua bilangan: %2.2f\n",total);
        System.out.printf("Jumlah data: %d\n",jumlahData);        
        System.out.printf("Nilai Rata - rata: %2.2f\n",average);
        System.out.printf("Nilai Minimal: %2.2f\n",min);
        System.out.printf("Nilai Maximal: %2.2f\n",max);

       
    }
}

