/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.program1;

/**
 *
 * @author agitnaeta
 * @npm 2024210052
 * 
 * Bilangan prima adalah bilangan yang habis dibagi 1 dan dirinya sendiri
 */
public class BilanganPrima {
    public static void main(String[] args) {
        int max = 100;

        System.out.println("Bilangan prima dari 2 sampai " + max + ":");
        for (int i = 2; i <= max; i++) {
           
            boolean prima = true;

            // contoh 
            // i = 2
            // j = 2 
            // 2 < 2 = maka tetap true tidal lewat loop
            // 2 < 3 = jika 2 % 3 != 0 maka tidak masuk if 
            
            
            // contoh masuk if 
            // i = 4 ; 
            // j = 2;
            // 2 < 4 maka masuk loop , dan 4 % 2 itu == 0 jadi di anggap false 
            // maka 4 tidak akan muncul
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.println(i);
            }
        }
    }
}
