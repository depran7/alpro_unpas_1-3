/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_of_record.contoh3;

/**
 *
 * @author depran
 */
public class PemainMain {

    public static void main(String[] args) {
        Pemain[] arrP = new Pemain[3];

        //input data
        for (int i = 0; i < arrP.length; i++) {
            System.out.println("Masukkan Pemain ke " + (i + 1));
            arrP[i] = new Pemain();
            arrP[i].inputData();
        }
        
        //tampil data
        for (int i = 0; i < arrP.length; i++) {
            System.out.println("Pemain ke " + (i + 1));
            arrP[i].showData();
        }
    }
}
