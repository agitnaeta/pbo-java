
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.agitnaeta.program1;

/**
 * 
 * @author agitnaeta
 * @npm 2024210052
 **/


public class FotoCopy {

    public static void main(String[] args) {
        // Tentukan lebar tiap kolom
        int widthLembar = 8;
        int widthHarga = 15;
        int gap = 4; // spasi antar kolom
        int jumlahKolom = 4;  // 1 -4 lembar harga

        printHeader(jumlahKolom, widthLembar, widthHarga, gap);

        int maxHargaLembar = 100;
        for (int i = 1; i <= maxHargaLembar; i += jumlahKolom) {
            int col2 = i + 1 <= 100 ? i + 1 : 0;
            int col3 = i + 2 <= 100 ? i + 2 : 0;
            int col4 = i + 3 <= 100 ? i + 3 : 0;

            System.out.printf("%-" + widthLembar + "d %-" + widthHarga + "d" + " ".repeat(gap),
                    i, i * 1000);

            if (col2 != 0)
                System.out.printf("%-" + widthLembar + "d %-" + widthHarga + "d" + " ".repeat(gap),
                        col2, col2 * 1000);
            else
                System.out.printf("%-" + widthLembar + "s %-" + widthHarga + "s" + " ".repeat(gap), "", "");

            if (col3 != 0)
                System.out.printf("%-" + widthLembar + "d %-" + widthHarga + "d" + " ".repeat(gap),
                        col3, col3 * 1000);
            else
                System.out.printf("%-" + widthLembar + "s %-" + widthHarga + "s" + " ".repeat(gap), "", "");

            if (col4 != 0)
                System.out.printf("%-" + widthLembar + "d %-" + widthHarga + "d%n", col4, col4 * 1000);
            else
                System.out.printf("%-" + widthLembar + "s %-" + widthHarga + "s%n", "", "");
        }
    }
    
    public static void printHeader(int jumlahKolom, int widthLembar, int widthHarga, int gap) {
        StringBuilder formatBuilder = new StringBuilder();
        for (int i = 0; i < jumlahKolom; i++) {
            formatBuilder.append("%-").append(widthLembar).append("s %-").append(widthHarga).append("s");
            if (i < jumlahKolom - 1) {
                formatBuilder.append(" ".repeat(gap));
            } else {
                formatBuilder.append("%n");
            }
        }
        String formatString = formatBuilder.toString();

        Object[] headerArgs = new Object[jumlahKolom * 2];
        for (int i = 0; i < jumlahKolom; i++) {
            headerArgs[i * 2] = "Lembar";
            headerArgs[i * 2 + 1] = "Harga fotokopi";
        }

        System.out.printf(formatString, headerArgs);

        int jumlahGap = jumlahKolom - 1;
        int totalWidth = (widthLembar + widthHarga) * jumlahKolom + gap * jumlahGap;
        System.out.println("-".repeat(totalWidth));
    }

}
