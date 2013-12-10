/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10.percobaan;

import java.io.File;

/**
 * Nama : Engelbertus Vione
 * NIM  : 125314112
 */
public class TestMahasiswa {
    public static void main(String[] args) throws Exception {
        String nama1="Andi";
        String nim1="001";
        String nama2="Bayu";
        String nim2="002";
        Mahasiswa mhs=new Mahasiswa();
        Mahasiswa[] m={new Mahasiswa(nama1, nim1), new Mahasiswa(nama2, nim2)};
        for (int i = 0; i < m.length; i++) {
//            System.out.println("Nama ke-"+(i+1)+":"+mhs.getNama());
//            System.out.println("Nim ke-"+(i+1)+":"+mhs.getnim());
            Mahasiswa.simpan(m);
            File hasil=Mahasiswa.simpan(m);
            System.out.println("Nama ke-"+(i+1)+":"+mhs.getNama());
            System.out.println("Nim ke-"+(i+1)+":"+mhs.getnim());
        }
      
    }
}
