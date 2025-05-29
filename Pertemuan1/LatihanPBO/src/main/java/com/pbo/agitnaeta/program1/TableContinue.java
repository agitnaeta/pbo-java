/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.program1;

/**
 *
 * @author agitnaeta
 * @npm 2024210052
 */
public class TableContinue {
    public static void main(String[] args) {
        int baris = 4;
        int kolom = 4;
        int angka = 1;

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.printf("%-5d", angka); // lebar kolom 5 karakter
                
                // angka akan disimpan ke variable angka unutuk loop baris selanjutnya
                angka++;
            }
            System.out.println(); // print new line
        }
    }
}

