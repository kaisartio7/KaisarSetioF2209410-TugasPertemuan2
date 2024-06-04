/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas1pbo;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Tugas1PBO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World!");
        // Input tiga bilangan pecahan
        System.out.print("Masukkan pecahan pertama: ");
        double a = scanner.nextDouble();
        
        System.out.print("Masukkan pecahan kedua: ");
        double b = scanner.nextDouble();
        
        System.out.print("Masukkan pecahan ketiga: ");
        double c = scanner.nextDouble();
        
        // Operasi penjumlahan
        double sum = a + b + c;
        System.out.println("Hasil penjumlahan: " + sum);
        
        // Operasi pengurangan
        double difference = a - b - c;
        System.out.println("Hasil pengurangan: " + difference);
        
        // Operasi perkalian
        double product = a * b * c;
        System.out.println("Hasil perkalian: " + product);
        
        // Operasi pembagian
        if (b != 0 && c != 0) {
            double division = a / b / c;
            System.out.println("Hasil pembagian: " + division);
        } else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan.");
        }
        
        scanner.close();
    }
}
