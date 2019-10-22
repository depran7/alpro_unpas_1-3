/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_of_record.contoh4;

import java.util.Scanner;

/**
 *
 * @author depran
 */
public class PemainMain {

    public static void inputData(Pemain p) {
        Scanner sc = new Scanner(System.in);

        //mengisi field nama
        System.out.println("Nama : ");
        p.setNama(sc.next() + sc.nextLine());

        //mengisi field no punggung
        System.out.println("No Punggung : ");
        p.setNoPunggung(sc.nextInt());

        //mengisi field gaji
        System.out.println("Gaji : ");
        p.setGaji(sc.nextInt());
    }

    public static void showData(Pemain p) {
        System.out.println("Nama : " + p.getNama());
        System.out.println("No Punggung : " + p.getNoPunggung());
        System.out.println("Gaji : " + p.getGaji());
    }

    public static void main(String[] args) {
        Pemain[] arrP = new Pemain[3];

        //input data
        for (int i = 0; i < arrP.length; i++) {
            System.out.println("Masukkan Pemain ke " + (i + 1));
            arrP[i] = new Pemain();
            inputData(arrP[i]);
        }
        
        //tampil data
        for (int i = 0; i < arrP.length; i++) {
            System.out.println("Pemain ke " + (i + 1));
            showData(arrP[i]);
        }
    }
}
