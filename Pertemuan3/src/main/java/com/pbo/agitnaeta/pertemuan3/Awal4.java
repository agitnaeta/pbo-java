/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.pertemuan3;

/**
 *
 * @author agitnaeta
 */
public class Awal4 {
    public static void main(String[] args) {
            // cara konstruktor
            Buku b1 = new Buku("Belajar Java", "Agit Naeta", 2021, 120000, true);
            Buku b2 = new Buku("Pemrograman Web", "Rina Sari", 2019, 95000, false);

          
            Buku b3 = new Buku("", "", 0, 0.0, false); // Buat default

            b3.setJudul("Basis Data");
            b3.setPenulis("Andi Wijaya");
            b3.setTahunTerbit(2020);
            b3.setHarga(110000);
            b3.setTersedia(true);
   

            // Print info for all Buku objects
            b1.printInfo();
            b2.printInfo();
            b3.printInfo();
    }
}
