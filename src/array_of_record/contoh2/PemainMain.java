/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_of_record.contoh2;

import java.util.Scanner;

/**
 *
 * @author depran
 */
public class PemainMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pemain[] arrP = new Pemain[3];

        //input data
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Pemain ke " + (i + 1));
            arrP[i] = new Pemain();

            //mengisi field nama
            System.out.println("Nama : ");
            arrP[i].setNama(sc.next() + sc.nextLine());

            //mengisi field no punggung
            System.out.println("No Punggung : ");
            arrP[i].setNoPunggung(sc.nextInt());

            //mengisi field gaji
            System.out.println("Gaji : ");
            arrP[i].setGaji(sc.nextInt());
        }

        //tampil data
        for (int i = 0; i < 3; i++) {
            System.out.println("Pemain ke " + (i + 1));
            System.out.println("Nama : " + arrP[i].getNama());
            System.out.println("No Punggung : " + arrP[i].getNoPunggung());
            System.out.println("Gaji : " + arrP[i].getGaji());
        }
    }
}
