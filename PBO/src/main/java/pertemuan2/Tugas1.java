/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import java.util.Scanner;

/**
 *
 * @author A-1
 */
public class Tugas1 {

    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int nilaiA = 10;
    int nilaiB = 20;
    double nilaiC = 15.5;
    double nilaiD = 10.5;
    
    boolean isPlus;
    isPlus = true;
    
        System.out.println("nilaiA ="+nilaiA);
        System.out.println("nilaiB ="+nilaiB);
        System.out.println("nilaiC ="+nilaiC);
        System.out.println("nilaiD ="+nilaiD);
        System.out.println("isPlus ="+isPlus);
        
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nilai baru untuk nilaiA (Int) : ");
        nilaiA = input.nextInt();
        
        System.out.println("masukkan nilai baru untuk nilaiB (Int) : ");
        nilaiB = input.nextInt();
        
        System.out.println("Masukkan nilai baru untuk nilaiC (Double) : ");
        nilaiC = input.nextDouble();
        
        System.out.println("Masukkan nilai baru untuk nilaiD (Double) : ");
        nilaiD = input.nextDouble();
        
        System.out.println("Masukkan nilai baru untuk isPlus (Boolean true/false) : ");
        isPlus = input.nextBoolean();
        
        
        String nama = "";
        System.out.println("Masukkan nama anda: ");
        nama = input.nextLine();
        nama = input.nextLine();
        System.out.println("nama anda adalah: " +nama);
        
    }
}
