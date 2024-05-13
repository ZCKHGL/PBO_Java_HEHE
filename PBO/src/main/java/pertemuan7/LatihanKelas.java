/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

/**
 *
 * @author A-1
 */
public class LatihanKelas {
    public static void main(String[] args) {
        String JudulBuku1 = "Java 1";
        String AuthorBuku1 = "Zacky";
        String JudulBuku2 = "Java 2";
        String AuthorBuku2 = "Kirra";
        System.out.println(JudulBuku1);
        System.out.println(AuthorBuku1);
        System.out.println(JudulBuku2);
        System.out.println(AuthorBuku2);
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        
        buku1.judul = "Java 1";
        buku1.author = "Zacky";
        buku2.judul = "Java 2";
        buku2.author = "Kirra";
        
        System.out.println(buku1.judul);
        System.out.println(buku1.author);
        System.out.println(buku2.judul);
        System.out.println(buku2.author);
        System.out.println(buku1.tahunpenerbitan);
        System.out.println(buku2.tahunpenerbitan);
        System.out.println(buku1.harga.beli);
        System.out.println(buku1.penerbit.nama);
        
    }
}

class Buku{
    String judul;
    String author;  
    int tahunpenerbitan = 2024;
    Harga harga = new Harga();
    Publisher penerbit = new Publisher();
    
}

class Harga{
    double jual = 10000.00;
    double beli = 8000.00;
}