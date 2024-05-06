/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

import java.util.Scanner;

/**
 *
 * @author A-12
 */
public class Latihan1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        System.out.print("Berapa Usiamu? ");
        age = keyboard.nextInt();
        System.out.println("Siapa Namamu?: ");
        if (age < 13) {
            System.out.println("\tAnda terlalu muda untuk membuat akun facebook");
        }
        if (age < 16) {
            System.out.println("\tAnda masih terlalu muda untuk mendapatkan SIM");
        }
        if (age <= 18) {
            System.out.println("\tAnda terlalu muda untuk menikah");
        }

        if (age < 35) {
            System.out.println("\tAnda terlalu muda untuk menjadi Presiden RI");

        if (age >= 50) {
                System.out.println("\tAnda sudah setengah baya, Hati-Hati dengan kulineran.");
            }
        }
    }
}
