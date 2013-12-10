package Minggu3;
public class TestIuran1 {
    public static void main(String[] args) {
        UnitKegiatanMahasiswa ukm = new UnitKegiatanMahasiswa("Paduan Suara Mahasiswa");
        Mahasiswa mah = new Mahasiswa("125314112", "Made", "Medan, 5 April 1989");
        Mahasiswa mah1 = new Mahasiswa("125314113", "Engel", "Sukamaju, 18 April 1994");
        Mahasiswa mah2[] = {new Mahasiswa("125314114", "Ratih", "Surabaya, 26 mei 1996"), 
                            new Mahasiswa("125314115", "Aan", "Medan, 12 des 1994")};
        MasyarakatSekitar mas[] = {new MasyarakatSekitar("123456", "Pak Ahmad", "Sukabumi, 31 mei 1967"), 
                                   new MasyarakatSekitar("123457", "Pak Budi", "Medan, 23 Februari 1967"), 
                                   new MasyarakatSekitar("123458", "Pak cecep", "Aceh, 14 Juni 1967")};
        ukm.setKetua(mah);
        ukm.setSekretaris(mah1);
        Penduduk[] pen = {mah2[0], mah2[1], mas[0], mas[1], mas[2]};
        ukm.setAnggota(pen);
        double total = 0;
        int a = 0;
        System.out.println("Nama UKM        : " + ukm.getNamaUnit());
        System.out.println("Nama Ketua      : " + ukm.getKetua().getNama());
        System.out.println("Nama Sekretaris : " + ukm.getSekretaris().getNama());
        System.out.println("Berikut nama-nama anggota beserta data-datanya:");
        for (int i = 0; i < ukm.getAnggota().length; i++) {
            System.out.println("Nama    : " + pen[i].getNama());
            if (pen[i] instanceof MasyarakatSekitar) {
                System.out.println("NIS     : " + mas[a].getNomor());                
            } else if (pen[i] instanceof Mahasiswa) {
                System.out.println("NIM     : " + mah2[i].getNim());
            }
            System.out.println("Iuran   : Rp" + pen[i].hitungiuran());
            System.out.println("TTL     : " + pen[i].getTempatTanggalLahir());
            System.out.println("");
            total += pen[i].hitungiuran();
        }
        System.out.println("Total Iuran  : Rp" + total);
        System.out.println("");
        System.out.println("Keterangan Lain : ");
       
        Juara ju[]={new Juara(ukm.getNamaUnit(), "Juara 3"),
                    new Juara(ukm.getNamaUnit(), "juara 2"), 
                    new Juara(ukm.getNamaUnit(), "Juara 1")};
        Juara[] daf={ju[0],ju[1],ju[2]};
        ukm.ikutlomba(daf);
       for (int j = 0; j < daf.length; j++) {
            String[]tahun=new String[daf.length];
            tahun[0]="2010";
            tahun[1]="2011";
            tahun[2]="2012";
            System.out.println("UKM     : "+daf[j].getNamaKejuaraan()+" tahun "+tahun[j]+"\n          "
                                        + "mendapat prestasi "+daf[j].getPrestasikejuaraan());           
        }
    }
}
