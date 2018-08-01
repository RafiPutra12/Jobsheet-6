/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;
import java.util.Scanner;
public class JobSheet6 {
public static void main(String[] args) {
   //deklaras variabbeli
    String nama, alamat;
    int usia, absen;
   //membuat scanner baru
   Scanner keyboard = new Scanner(System.in);
   //Tampilkan output ke user
   System.out.println("### DATA SISWA SMK TELKOM MALANG ###");
   System.out.println("NAMA SISWA: ");
   //mENGGUNAKAN SVCANNER DAN MENYIMPAN APA YANG DIKETIK DI VARIABEL NAMA
   nama = keyboard.next();
   //Tampilkan output lagi
   System.out.println("Alamat: ");
   //Menggunakan scanner lagi
   alamat = keyboard.next();
   System.out.print("Absen: ");
   usia = keyboard.nextInt();
   System.out.print("Usia: " );
   absen = keyboard.nextInt();
   // menampilkan apa yang sudah disimpan di variabel
   System.out.println("---------------");
   System.out.println("NAMA SISWA :" + nama);
   System.out.println("Alamat: " + alamat);
   System.out.println("Usia: " + usia + "tahun");
   System.out.println("Absen : " + absen);
   
   
   
   
   
   
       
       
    }
    
}
