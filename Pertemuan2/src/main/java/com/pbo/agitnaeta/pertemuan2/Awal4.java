/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.pertemuan2;

/**
 *
 * @author agitnaeta
 */
public class Awal4 {
    public static void main(String[] args) {
        Buku b1 = new Buku("Belajar Java", "Agit Naeta", 2021, 120000, true);
        Buku b2 = new Buku("Pemrograman Web", "Rina Sari", 2019, 95000, false);
        Buku b3 = new Buku("Basis Data", "Andi Wijaya", 2020, 110000, true);

        b1.printInfo();
        b2.printInfo();
        b3.printInfo();
    }
}
