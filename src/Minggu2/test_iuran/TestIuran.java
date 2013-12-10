/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2.test_iuran;

import Minggu2.pr_pbo2_part2.Mahasiswa;
import Minggu2.pr_pbo2_part2.MasyarakatSekitar;
import Minggu2.pr_pbo2_part2.UnitKegiatanMahasiswa;



/**
 *
 * @author admin
 */
public class TestIuran {
    public static void main(String[] args) {
        Mahasiswa mah1=new Mahasiswa("1234", "Aan", "Medan, 12 des 1994");
        Mahasiswa mah2=new Mahasiswa("1235", "Budi", "Bandarlampung, 13 april 1996");
        
        MasyarakatSekitar mas1=new MasyarakatSekitar("10001", "Pak Awan", "Surabaya, 18 mei 1892");
        MasyarakatSekitar mas2=new MasyarakatSekitar("10002", "Pak Budi", "Aceh, 23 juni 1867");
        
        
        UnitKegiatanMahasiswa ukm1=new UnitKegiatanMahasiswa("Bulu Tangkis");
        UnitKegiatanMahasiswa ukm2=new UnitKegiatanMahasiswa("Sepakbola");
        UnitKegiatanMahasiswa ukm3=new UnitKegiatanMahasiswa();
        ukm3.getAnggota();
        System.out.println("UKM :"+ukm1.getNamaUnit()+"\ndianggotai oleh:");
        System.out.println("Nama\tNIM/NIS\tTTL\tStatus");
        System.out.println(mah1.getNama()+"\t "+mah1.getNim()+"\t   "+mah1.getTempatTanggalLahir()+"\t");
        System.out.println(mas1.getNama()+"\t "+mas1.getNomor()+"\t "+mas1.getTempatTanggalLahir());

       // System.out.println("");
    }
    
}
