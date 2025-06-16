/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.pertemuan4;

/**
 *
 * @author agitnaeta
 */
public class PesertaBelajar extends Mahasiswa {
    
    private int jumlahJournal=0;
   
    public PesertaBelajar() {
        super();
    }
    
    public void setJumlahJournal(int jumlah){
        this.jumlahJournal = jumlah;
    }
    
    public int getJumlahJournal(){
        return   this.jumlahJournal;
    }
   
   
   @Override 
   public void print(){
        System.out.println("\n--- Info Peserta Belajar ---");
        System.out.println("Nama        : " + this.getName());
        System.out.println("NPM         : " + this.getNpm());
        System.out.println("Kelas       : " + this.getKelas());
        System.out.println("Alamat      : " + this.getAlamat());
        System.out.println("Telepon     : " + this.getAlamat());
        System.out.println("Jurnal     : " + this.getJumlahJournal());
        System.out.println("Umur        : " + hitungUmur() + " tahun");
   }
}
