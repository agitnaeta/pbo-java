/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.pertemuan3;

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
    k1.setName("Avanza");
    k1.setType("Mobil");
    k1.setTire(4);
    k1.setCc(1500);
    k1.setColor("Merah");

    Kendaraan k2 = new Kendaraan();
    k2.setName("Ninja");
    k2.setType("Motor");
    k2.setTire(2);
    k2.setCc(250);
    k2.setColor("Hijau");

    Kendaraan k3 = new Kendaraan();
    k3.setName("Truk");
    k3.setType("Truk");
    k3.setTire(6);
    k3.setCc(3000);
    k3.setColor("Biru");

    k1.printInfo();
    k2.printInfo();
    k3.printInfo();
   }
}
