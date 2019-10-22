/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package records.contoh3;

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
        Pemain p1 = new Pemain();
        Pemain p2 = new Pemain();
        Pemain p3 = new Pemain();

        //input data
        inputData(p1);
        inputData(p2);
        inputData(p3);

        //tampil data
        showData(p1);
        showData(p2);
        showData(p3);
    }
}
