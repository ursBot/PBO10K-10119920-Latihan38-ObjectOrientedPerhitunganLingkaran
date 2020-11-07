/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan38.objectorientedperhitunganlingkaran;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class Lingkaran{
    DecimalFormat df = new DecimalFormat("#.##");
    public double diameter;
    public double jariJari;
    public double luas;
    public double keliling;
    public final double phi = 3.14;
    public boolean check;
    
    public double hitungJariJari(){
        jariJari = diameter / 2;
        System.out.println("Jari-jari Lingkaran = "+ df.format(jariJari).replace("." , ",") +" cm");
        return 0;
    }
    public double hitungLuas(){
        luas = phi * jariJari * jariJari;
        System.out.println("Luas Lingkaran = "+ df.format(luas).replace("." , ",") +" cm");
        return 0;
    }
    public double hitungKeliling(){
        keliling = phi * diameter;
        System.out.println("Keliling lingkaran = "+ df.format(keliling).replace("." , ",") +" cm");
        return 0;
    }
}

public class PerhitunganLingkaran {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Lingkaran l = new Lingkaran();
        
        System.out.println("======Perhitungan Lingkaran====");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        while(true) 
        {
            try {
                l.diameter = Double.parseDouble(input.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                System.out.print("Masukkan nilai diameter lingkaran : ");
            }
        }
        System.out.println();
        System.out.println("=====Hasil Perhitungan Lingkaran====");
        l.hitungJariJari();
        l.hitungLuas();
        l.hitungKeliling();
    }
}