/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan25ejaannama;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : Program ejaan nama
 */
public class PBO10118045Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        Scanner nm = new Scanner (System.in);
        nama = nm.next();
        System.out.println("");
        System.out.println("Ejaan untuk \"" +nama+ "\"adalah : ");
        for(int i = 0; i < nama.length() ; i++)
            System.out.println("Huruf ke - " + (i+1)+ " : " +nama.charAt(i));
            
        
    }
    
}
