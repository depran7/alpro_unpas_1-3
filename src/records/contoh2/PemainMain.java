/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package records.contoh2;

/**
 *
 * @author depran
 */
public class PemainMain {

    public static void main(String[] args) {
        Pemain p1 = new Pemain();
        Pemain p2 = new Pemain();
        Pemain p3 = new Pemain();

        //input data
        p1.inputData();
        p2.inputData();
        p3.inputData();

        //tampil data
        p1.showData();
        p2.showData();
        p3.showData();
    }
}
