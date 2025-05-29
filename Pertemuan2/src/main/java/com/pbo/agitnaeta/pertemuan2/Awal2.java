/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.pertemuan2;

import java.util.Scanner;

/**
 *
 * @author agitnaeta
 * 
 *   String name;
    String type;
    int tire;
    double cc;
    String color;
 */
public class Awal2 {
     public static void main(String[] args) {
       Kendaraan k1 = new Kendaraan();
        k1.name = "Avanza";
        k1.type = "Mobil";
        k1.tire = 4;
        k1.cc = 1500;
        k1.color = "Merah";

        Kendaraan k2 = new Kendaraan();
        k2.name = "Ninja";
        k2.type = "Motor";
        k2.tire = 2;
        k2.cc = 250;
        k2.color = "Hijau";

        Kendaraan k3 = new Kendaraan();
        k3.name = "Truk";
        k3.type = "Truk";
        k3.tire = 6;
        k3.cc = 3000;
        k3.color = "Biru";

        k1.printInfo();
        k2.printInfo();
        k3.printInfo();
                
    }
}
