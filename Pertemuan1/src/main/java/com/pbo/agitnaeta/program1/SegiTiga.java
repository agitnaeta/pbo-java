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
public class SegiTiga {
    public static void main(String[] args) {
        
        int tinggi = 5;

        for (int i = 0; i < tinggi; i++) {
            // print spasi yang di cetak sebelum bintang
            int jumlahTotalSpasi = tinggi - i - 1;
            for (int spasi = 0; spasi < jumlahTotalSpasi; spasi++) {
                System.out.print(" ");
            }

            // 1 , 3, 5, 7. 9 dst 
            int selisih=2;
            for (int bintang = 0; bintang < selisih * i + 1; bintang++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
