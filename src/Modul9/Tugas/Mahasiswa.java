/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9.Tugas;

import Modul9.MessageException;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
public class Mahasiswa {

    private String nama, nim, tgl, bulan, tahun, iuran, namaukm;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim, String tgl, String bulan, String tahun, String iuran, String namaukm) {
        this.nama = nama;
        this.nim = nim;
        this.tgl = tgl;
        this.bulan = bulan;
        this.tahun = tahun;
        this.iuran = iuran;
        this.namaukm = namaukm;
    }

    public String getIuran() {
        return iuran;
    }

    public void setIuran(String iuran) throws Exception {
        String polaiuran = "[0-9]{9}";
        if (iuran.matches(polaiuran)) {
            this.iuran = iuran;
        } else {
            throw new Exception("iuran salah");
        }

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

    public String getNamaukm() {
        return namaukm;
    }

    public void setNamaukm(String namaukm) throws Exception {
        String polaukm = "[a-z][A-Z].*";
        if (namaukm.matches(polaukm)) {
            this.namaukm = namaukm;
        } else {
            throw new Exception("Error");
        }
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) throws Exception {
        String polanim = "[0-9]{9}";
        StringTokenizer st = new StringTokenizer(nim);
        if ((st.countTokens() < 10) && (nim.matches(polanim))) {
            this.nim = nim;
        } else {
            throw new MessageException("Error");
        }
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) throws Exception {
        String polabulan = "[0-9]{9}";
        StringTokenizer st = new StringTokenizer(bulan);
        if ((st.countTokens() < 3) && (bulan.matches(polabulan))) {
            this.bulan = bulan;
        } else {
            throw new MessageException("Error");
        }
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) throws Exception {
        String polatahun = "[0-9]{9}";
        StringTokenizer st = new StringTokenizer(tahun);
        if ((st.countTokens() < 5) && (tahun.matches(polatahun))) {
            this.tahun = tahun;
        } else {
            throw new MessageException("Error");
        }
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) throws Exception {
        String polatanggal = "[0-9]{9}";
        StringTokenizer st = new StringTokenizer(tgl);
        if ((st.countTokens() < 3) && (tgl.matches(polatanggal))) {
            this.tgl = tgl;
        } else {
            throw new MessageException("Error");
        }
    }

    public static void main(String[] args) throws Exception {
        Mahasiswa m = new Mahasiswa();
        Scanner s = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = s.next();
        m.setNama(nama);
        System.out.println("Nama yang sudah diisi: " + m.getNama());
    }
}
