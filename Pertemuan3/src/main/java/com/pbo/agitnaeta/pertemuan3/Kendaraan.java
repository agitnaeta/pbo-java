/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.pertemuan3;

/**
 *
 * @author agitnaeta
 */
public class Kendaraan {

    private String name;
    private String type;
    private int tire;
    private double cc;
    private String color;

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getTire() {
        return tire;
    }

    public double getCc() {
        return cc;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTire(int tire) {
        this.tire = tire;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo() {
        System.err.println("========Info Kendaraan============");
        System.out.printf("Nama: %s\n", this.getName());
        System.out.printf("Type: %s\n", this.getType());
        System.out.printf("Roda: %d\n", this.getTire());
        System.out.printf("cc: %4.0f\n", this.getCc());
        System.out.printf("Warna: %s\n", this.getColor());
        System.err.println("========Selesai============");
    }
}
