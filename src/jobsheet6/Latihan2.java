/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Latihan2 {
    public static void main(String[] args) throws IOException {
        String nama;
        // membuat objek inputan
        InputStreamReader isr = new InputStreamReader(System.in);
        // membuat objek bufferedreader
        BufferedReader br = new BufferedReader(isr);
        // mengisi variabel nama dengan bufferedreader
        System.out.print("Inptkan nama:");
        nama = br.readLine();
        // tampilkan output variabel nama
        System.out.println("Nama kamu adalah: " + nama);
        
        
        
        
    }
    
}
