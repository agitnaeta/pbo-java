/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.agitnaeta.pertemuan2;
import java.util.Scanner;

/**
 *
 * @author agitnaeta
 */
public class Pertemuan2 {

    public static void main(String[] args) {
        System.out.println("Daftar Kode program");
        System.out.println("1. Awal 1 (Mahasiswa)");
        System.out.println("2. Awal 2 Kendaraan");
        System.out.println("3. Awal 3 MataKuliah");
        System.out.println("4. awal 4 Buku");
        System.out.println("4. awal 5 Komputer");
        
        System.out.println("Masukan Nomor: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        //com/pbo/agitnaeta/pertemuan2/Pertemuan2.java:[27,45] ';' expected
       switch(input){
           case 1: Awal1.main(new String[]{}); break;
           case 2: Awal2.main(new String[]{}); break;
           case 3: Awal3.main(new String[]{}); break;
           case 4: Awal4.main(new String[]{}); break;
           case 5: Awal5.main(new String[]{}); break;
           default: System.out.println("Tidak ada input valid");
       }
        
    }
}
