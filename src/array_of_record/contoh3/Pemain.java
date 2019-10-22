/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_of_record.contoh3;

import java.util.Scanner;

/**
 *
 * @author depran
 */
public class Pemain {
    private String nama;
    private int noPunggung;
    private int gaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNoPunggung() {
        return noPunggung;
    }

    public void setNoPunggung(int noPunggung) {
        this.noPunggung = noPunggung;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        
        //mengisi field nama
        System.out.println("Nama : ");
        setNama(sc.next() + sc.nextLine());
        
        //mengisi field no punggung
        System.out.println("No Punggung : ");
        setNoPunggung(sc.nextInt());
        
        //mengisi field gaji
        System.out.println("Gaji : ");
        setGaji(sc.nextInt());        
    }
    
    public void showData(){
        System.out.println("Nama : " + getNama());
        System.out.println("No Punggung : " + getNoPunggung());
        System.out.println("Gaji : " + getGaji());
    }
}
