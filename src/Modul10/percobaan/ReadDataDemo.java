/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10.percobaan;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class ReadDataDemo {

    public ReadDataDemo() {
    }

    public static void main(String[] args) {
        // write the data out with FileOutputStream
        // buat file
        File inputFile = new File("latihan.txt");
        try {
            // buka stream
            FileInputStream in = new FileInputStream(inputFile);
            // buat buffer pembacaan data
            String testInput = new String();
            // variabel integer untuk membaca data dari file yang dibuka
            int c;
            // cek akhir dari file apakah bernilai -1
            while ((c = in.read()) != -1) {
                // tambahkan data pembacaan ke buffer
                testInput += (char) c;
            }
            // tutup stream
            in.close();
            System.out.println(testInput);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
