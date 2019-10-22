/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author depran
 */
public class ArrayInt {

    public static void main(String[] args) {
        //penampung banyak data int
        int[] arrInt = new int[6];

        Scanner sc = new Scanner(System.in);
        //mengisi data array
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = sc.nextInt();
        }

        //menampilkan data array
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("index ke :" + i + " = " +arrInt[i]);
        }
    }
}
