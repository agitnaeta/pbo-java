/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.pertemuan2;

/**
 *
 * @author agitnaeta
 */
public class Awal5 {
     public static void main(String[] args) {
        Komputer k1 = new Komputer("Dell", "Intel i5", 8, 15.6, 'S', true, 2022);
        Komputer k2 = new Komputer("HP", "AMD Ryzen 7", 16, 14.0, 'S', true, 2021);
        Komputer k3 = new Komputer("Lenovo", "Intel i7", 32, 17.3, 'H', false, 2020);
        Komputer k4 = new Komputer("Asus", "Intel i3", 4, 13.3, 'H', true, 2019);
        Komputer k5 = new Komputer("Acer", "AMD Ryzen 5", 8, 15.0, 'S', false, 2023);

        k1.printInfo();
        k2.printInfo();
        k3.printInfo();
        k4.printInfo();
        k5.printInfo();
    }
}
