/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.pertemuan3;

/**
 *
 * @author agitnaeta
 */
public class Awal5 {
     public static void main(String[] args) {
        Komputer k1 = new Komputer("", "", 0, 0.0, ' ', false, 0);
        Komputer k2 = new Komputer("", "", 0, 0.0, ' ', false, 0);
        Komputer k3 = new Komputer("", "", 0, 0.0, ' ', false, 0);
        Komputer k4 = new Komputer("", "", 0, 0.0, ' ', false, 0);
        Komputer k5 = new Komputer("", "", 0, 0.0, ' ', false, 0);

        // Set values using setter methods
        k1.setMerk("Dell");
        k1.setProcessor("Intel i5");
        k1.setRamGB(8);
        k1.setLayarInci(15.6);
        k1.setTipeStorage('S');
        k1.setAdaWebcam(true);
        k1.setTahunRilis(2022);

        k2.setMerk("HP");
        k2.setProcessor("AMD Ryzen 7");
        k2.setRamGB(16);
        k2.setLayarInci(14.0);
        k2.setTipeStorage('S');
        k2.setAdaWebcam(true);
        k2.setTahunRilis(2021);

        k3.setMerk("Lenovo");
        k3.setProcessor("Intel i7");
        k3.setRamGB(32);
        k3.setLayarInci(17.3);
        k3.setTipeStorage('H');
        k3.setAdaWebcam(false);
        k3.setTahunRilis(2020);

        k4.setMerk("Asus");
        k4.setProcessor("Intel i3");
        k4.setRamGB(4);
        k4.setLayarInci(13.3);
        k4.setTipeStorage('H');
        k4.setAdaWebcam(true);
        k4.setTahunRilis(2019);

        k5.setMerk("Acer");
        k5.setProcessor("AMD Ryzen 5");
        k5.setRamGB(8);
        k5.setLayarInci(15.0);
        k5.setTipeStorage('S');
        k5.setAdaWebcam(false);
        k5.setTahunRilis(2023);

        // Print info to verify
        k1.printInfo();
        k2.printInfo();
        k3.printInfo();
        k4.printInfo();
        k5.printInfo();
    }

}
