/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.agitnaeta.pertemuan4;

/**
 *
 * @author agitnaeta
 */
public class Pertemuan4 {

    public static void main(String[] args) {
        
        // Implementasi Static
        StudentRecord.main(new String[]{});
        
        
        
       // Latihan Inheritence 
       PesertaBelajar pb = new PesertaBelajar();
       pb.setJumlahJournal(10);
        pb.setName("Agit Naeta");
        pb.setAlamat("Sumedang");
        pb.setKelas("h");
        pb.setNpm("12345");
        pb.setTahunLahir(1993);
        pb.setTelepon("085720108161");
       pb.print();
       
       System.out.printf("Jumlah total Peserta + mahasiswa %d orang",pb.getJumlahMahasiswa());
       
    }
}
