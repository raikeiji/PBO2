/*
 * Nama : Engelbertus Vione
 * NIM  : 125314112
 */
package Modul10.percobaan;

import Modul9.MessageException;
import java.io.*;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Mahasiswa {

    private String nama, nim;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) throws Exception {
        String polanama = "[a-z][A-Z].*";
        if (nama.matches(polanama)) {
            this.nama = nama;
        } else {
            throw new Exception("nama salah");
        }
    }

    public String getnim() {
        return nim;
    }

    public void setnim(String nim) throws MessageException {
        String polanim = "[0-9]{9}";
        StringTokenizer st = new StringTokenizer(nim);
        if ((st.countTokens() < 10) && (nim.matches(polanim))) {
            this.nim = nim;
        } else {
            throw new MessageException("Error");
        }
    }

    public static File simpan(Mahasiswa[] listmahasiswa) throws Exception {
        File hasil = new File("hasil.txt");
        FileOutputStream os = new FileOutputStream(hasil);
        try {
            for (int i = 0; i < listmahasiswa.length; i++) {
                byte[] tempNim = listmahasiswa[i].nim.getBytes();
                os.write(tempNim);
                int newTab = (int) '\t';
                os.write(newTab);

                byte[] tempNama = listmahasiswa[i].nama.getBytes();
                os.write(tempNama);
                int newLine = (int) '\n';
                os.write(newLine);

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                os.close();
            } catch (IOException ex) {
                Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return hasil;
    }

    public static Mahasiswa[] baca(File input) {
        //asumsikan panjang maksimum mahasiswa
        Mahasiswa[] hasil = new Mahasiswa[10];
        try {
            FileInputStream is = new FileInputStream(input);
            String out = new String();
            // buat buffer pembacaan data
            String testInput = new String();
            int c;
            while ((c = is.read()) != -1) {
                testInput += (char) c;
            }
            is.close();
            System.out.println(testInput);
        } catch (Exception ex) {
            Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
}
