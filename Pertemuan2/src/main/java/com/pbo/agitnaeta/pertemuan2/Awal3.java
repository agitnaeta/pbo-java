/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.pertemuan2;

/**
 *
 * @author agitnaeta
 */
public class Awal3 {
     public static void main(String[] args) {
        // Membuat objek Matakuliah
        Matakuliah m1 = new Matakuliah("IF101", "Pemrograman Dasar", 3, 87.5, 'A');
        Matakuliah m2 = new Matakuliah("MT201", "Matematika Diskrit", 4, 78.0, 'B');
        Matakuliah m3 = new Matakuliah("BD301", "Basis Data", 3, 90.0, 'A');

        // Menampilkan info masing-masing matakuliah
        m1.printInfo();
        m2.printInfo();
        m3.printInfo();
    }
}
