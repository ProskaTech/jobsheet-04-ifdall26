/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS
 */
public class Latihan1_PenggunaanOperatorAritmatika {
    public static void main(String[] args){
        int i = 10;
        int j = 3;
        double x = 27.475;
        double y = 7.22;
        
        System.out.println("Variable values...");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        //Penjumlahan angka
        System.out.println("Adding...");
        System.out.println("i + j = " + (i + j));
        System.out.println("x + y = " + (x + y));
        
        //Pengurangan angka
        System.out.println("Substracting...");
        System.out.println("i - j = " + (i - j));
        System.out.println("x - y = " + (x - y));
        
        //Perkalian angka
        System.out.println("Multiplying...");
        System.out.println("i * j = " + (i * j));
        System.out.println("x * y = " + (x * y));
        
        //Pembagian angka
        System.out.println("Dividing...");
        System.out.println("i / j = " + ((float)i / j));
        System.out.println("x / y = " + (x / y));
        
        //menghitung hasil modulus dari pembagian
        System.out.println("Computing the reminder...");
        System.out.println("i % j = " + (i % j));
        System.out.println("x % y = " + (x % y));
        
        //Tipe penggabungan
        System.out.println("Mixing types");
        System.out.println("j + y = " + (j + y));
        System.out.println("i * x = " + (i * x));
    }
}
