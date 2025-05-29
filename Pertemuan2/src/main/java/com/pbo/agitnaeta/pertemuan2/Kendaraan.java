/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.pertemuan2;
import java.util.Scanner;

/**
 *
 * @author agitnaeta
 */
public class Kendaraan {
    
    String name;
    String type;
    int tire;
    double cc;
    String color;

 

    public void printInfo(){
    
        System.err.println("========Info Kendaraan============");
        System.out.printf("Nama: %s\n", this.name);
        System.out.printf("Type: %s\n", this.type);
        System.out.printf("Roda: %d\n", this.tire);
        System.out.printf("cc: %4.0f\n", this.cc);
        System.out.printf("Warna: %s\n", this.color);
        System.err.println("========Selesai============");
    
    }
}
