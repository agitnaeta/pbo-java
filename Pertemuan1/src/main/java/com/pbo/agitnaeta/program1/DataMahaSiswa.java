/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.agitnaeta.program1;
import java.util.Scanner;

/**
 *
 * @author agitnaeta
 * @npm 2024210052
 */
public class DataMahaSiswa {
    
    String name;
    String npm;
    String kelas;
    

    public DataMahaSiswa(String name, String npm, String kelas)
    {
        this.name = name;
        this.npm = npm;
        this.kelas = kelas;
       
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input Name
        System.out.printf("Masukan Nama Anda:");
        String name = scanner.nextLine();
        
        // Input NPM 
        System.out.printf("Masukan NPM Anda:");
        String npm = scanner.nextLine();
        
        // input kelas 
        System.out.printf("Masukan Kelas:");
        String kelas = scanner.nextLine();
        
        DataMahaSiswa mahasiswa = new DataMahaSiswa(name,npm,kelas); 
         // Display result
        System.out.println("\n--- Info Mahasiswa ---");
        mahasiswa.printInfo();
    }
    
    public void printInfo(){
        
        System.out.printf("Nama: %s\n", this.name);
        System.out.println("--------------------------------");
        System.out.printf("NPM: %s\n", this.npm);
        System.out.println("--------------------------------");
        System.out.printf("Kelas: %s\n", this.kelas);
        System.out.println("=====================");
    
    }
    
}
