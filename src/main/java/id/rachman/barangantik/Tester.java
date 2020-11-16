/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.barangantik;

/**
 * 
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi untuk menampilkan nama & umur barang antik
 * 
 */

 public class Tester {
     public static int umur = 234;
     public static void main(String[] args) {
        Radio radio = new Radio(umur);
        radio.setName("Radio AM");
        System.out.println("Nama barang Antik : " + radio.getName());
        radio.tampilUmur();
     }
 }