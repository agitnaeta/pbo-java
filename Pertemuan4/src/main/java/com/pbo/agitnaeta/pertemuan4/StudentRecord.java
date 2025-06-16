/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.pertemuan4;

/**
 *
 * @author agitnaeta
 */
public class StudentRecord {
    
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
      
        
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setName("Agit Naeta");
        mhs1.setAlamat("Sumedang");
        mhs1.setKelas("h");
        mhs1.setNpm("12345");
        mhs1.setTahunLahir(1993);
        mhs.setTelepon("085720108161");
        
          Mahasiswa mhs2 = new Mahasiswa();
        
        mhs.print();
        mhs1.print();
        mhs2.print();
        
        System.out.printf("Jumlah mahasiswa %d orang",mhs.getJumlahMahasiswa());
        
    }
}
