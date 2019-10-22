/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package records.contoh1;

import array_of_record.contoh2.Pemain;
import java.util.Scanner;

/**
 *
 * @author depran
 */
public class PemainMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pemain p1 = new Pemain();
        Pemain p2 = new Pemain();
        Pemain p3 = new Pemain();

        //input data
        //mengisi field nama
        
        //pemain ke 1
        System.out.println("Nama : ");
        p1.setNama(sc.next() + sc.nextLine());
        
        //mengisi field no punggung
        System.out.println("No Punggung : ");
        p1.setNoPunggung(sc.nextInt());
        
        //mengisi field gaji
        System.out.println("Gaji : ");
        p1.setGaji(sc.nextInt());  
        
        //pemain ke 2
        System.out.println("Nama : ");
        p2.setNama(sc.next() + sc.nextLine());
        
        //mengisi field no punggung
        System.out.println("No Punggung : ");
        p2.setNoPunggung(sc.nextInt());
        
        //mengisi field gaji
        System.out.println("Gaji : ");
        p2.setGaji(sc.nextInt());  
        
        //pemain ke 3
        System.out.println("Nama : ");
        p3.setNama(sc.next() + sc.nextLine());
        
        //mengisi field no punggung
        System.out.println("No Punggung : ");
        p3.setNoPunggung(sc.nextInt());
        
        //mengisi field gaji
        System.out.println("Gaji : ");
        p3.setGaji(sc.nextInt());  

        //tampil data
        System.out.println("Nama : " + p1.getNama());
        System.out.println("No Punggung : " + p1.getNoPunggung());
        System.out.println("Gaji : " + p1.getGaji());
        
        System.out.println("Nama : " + p2.getNama());
        System.out.println("No Punggung : " + p2.getNoPunggung());
        System.out.println("Gaji : " + p2.getGaji());
        
        System.out.println("Nama : " + p3.getNama());
        System.out.println("No Punggung : " + p3.getNoPunggung());
        System.out.println("Gaji : " + p3.getGaji());
    }
}
