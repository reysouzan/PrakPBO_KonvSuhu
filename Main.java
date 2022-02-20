/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konvsuhu;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result;
        double SAwal;
        System.out.println("+===========================+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+===========================+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius\t: ");
        SAwal = input.nextDouble();
        do{
            Operasi fromC = new Operasi(SAwal);
            System.out.println("");
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih\t: ");
            result=input.nextInt();
            if(result == 1){
                System.out.println("");
                System.out.println("Suhu dalam Celcius\t: " + SAwal + "°C");
                System.out.println("Dalam Fahrenheit\t: " + fromC.Fahrenheit() + "°F");
                System.out.println("Dalam Reamur\t\t: " + fromC.Reamur() + "°R");
                System.out.println("Dalam Kelvin\t\t: " + fromC.Kelvin() + "K");
                System.out.println("Kondisi Air " + fromC.kondisi());
            }
            else if(result == 2){
                System.out.println("\nInput Data");
                System.out.println("----------");
                System.out.print("Suhu Dalam Celcius\t: ");
                SAwal = input.nextDouble();
            }
            else if(result != 3){
                System.out.println("\nOpsi tidak ada. Mohon masukkan opsi dengan benar");
            }
        }while(result!=3);
    }
    
}
