/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.program1;
import java.util.Scanner;
/**
 *
 * @author agitnaeta
 * @npm 2024210052
 */
public class TarifSewa {
    
       String kendaraan; 
       double tarif;
       double biayaHarian;
       int lamaHari;
       double bayar;
    
    
    public TarifSewa(
       String kendaraan, 
       double tarif,
       double biayaHarian,
       int lamaHari, 
       double bayar
    )
    {
        this.kendaraan = kendaraan;
        this.tarif  = tarif;
        this.biayaHarian = biayaHarian;
        this.lamaHari = lamaHari;
        this.bayar = bayar;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukan Nama Kendaraan: ");
        String kendaraan = scanner.nextLine();
        
        System.out.println("Masukan Tarif: ");
        double tarif = scanner.nextDouble();
        
        System.out.println("Masukan Biaya Harian: ");
        double biayaHarian = scanner.nextDouble();
         
        System.out.println("Masukan Lama Hari: ");
        int lamaHari = scanner.nextInt();
        
        double bayar = 0.0;
        
        TarifSewa sewa = new TarifSewa(kendaraan, tarif, biayaHarian,lamaHari,bayar);
        
        sewa.printInfo();
        
    }
    
    public void printInfo(){
        
        this.bayar = this.tarif + this.biayaHarian * this.lamaHari;

        System.out.printf("%-12s %10s %12s %8s %10s\n", "Kendaraan", "Tarif", "Biaya/Hari", "Lama", "Bayar");
        System.out.printf("%-12s %10.0f %12.0f %8d %10.0f\n", this.kendaraan, this.tarif, this.biayaHarian, this.lamaHari, this.bayar);

        
    }
    
}
