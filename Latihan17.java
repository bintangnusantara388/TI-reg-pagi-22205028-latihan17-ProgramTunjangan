/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan17;
/**
 *
 * @author user 
 Nama              : Bintang Fajar Nusantara 
 Nim               : 22205028 
 Prodi             : Teknik Informatika 
 Kelas             : PBO 1
 Deskripsi Program : Program ini berisi program yang menampilkan Tunjangan
 */
import java.util.Scanner;

public class Latihan17 {

    public static void main(String[] args) {
           int gajipokok;
        String status;
        double tunjangan;
        
        System.out.println("======Program Tunjangan======");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Berapa gaji pokok anda perbulan? :");
        gajipokok = scanner.nextInt();
        System.out.print("Status Anda? (menikah/belum) :");
        status = scanner.next();
        System.out.println("==============================");
               
        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = gajipokok * 0.35;
        } else 
            tunjangan = 0;

        System.out.println("\n");
        System.out.println("======Hasil Perhitungan Gaji Anda======");
        System.out.println("Gaji Pokok: Rp " + gajipokok);
        System.out.println("Tunjangan: Rp " + tunjangan);
        System.out.println("Total Gaji: Rp " + (gajipokok + tunjangan));
        System.out.println("(Developed by : Bintang Fajar Nusantara)");
        
    }
    
}
