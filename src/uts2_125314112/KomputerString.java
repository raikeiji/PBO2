/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts2_125314112;

import java.util.StringTokenizer;

/**
 *
 * @author made
 */
public class KomputerString {

    private String id, nama, merk, harga;

    public KomputerString() {
    }

    public KomputerString(String id, String nama, String merk, String harga) {
        this.id = id;
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws Exception {
        String polaid = "[0-9]{9}";
        StringTokenizer st = new StringTokenizer(id);
        if (st.countTokens() < 6 && (id.matches(polaid))) {
            this.id = id;
        } else {
            throw new Exception("id harus berisi dengan angka dan kurang dari 6 digit");
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

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) throws Exception {
        String polaMerk = "[a-z][A-Z].*";
        if (merk.matches(polaMerk)) {
            this.merk = merk;
        } else {
            throw new Exception("Merek harus menggunakan huruf");
        }
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) throws Exception {
        String polaharga = "[0-9]{9}";
        if (harga.matches(polaharga)) {
            this.harga = harga;
        } else {
            throw new Exception("Harga harus menggunakan angka");
        }
    }

}
