package Minggu3;
public class UnitKegiatanMahasiswa extends Penduduk implements Lomba{
    private String namaUnit;
    private Mahasiswa ketua;
    private Mahasiswa sekretaris;
    private Penduduk anggota[];
    int jumlahjuara=0;
    private Juara[] daftarjuara=new Juara[10];
    
    public UnitKegiatanMahasiswa() {
    }

    public UnitKegiatanMahasiswa(String namaUnit) {
        this.namaUnit = namaUnit;
    }

    public Penduduk[] getAnggota() {
        return anggota;
    }

    public void setAnggota(Penduduk[] in_dataanggota) {
        this.anggota = in_dataanggota;
    }

    public Mahasiswa getKetua() {
        return ketua;
    }

    public void setKetua(Mahasiswa in_dataketua) {
        this.ketua = in_dataketua;
    }

    public String getNamaUnit() {
        return namaUnit;
    }

    public void setNamaUnit(String in_namaUnit) {
        this.namaUnit = in_namaUnit;
    }

    public Mahasiswa getSekretaris() {
        return sekretaris;
    }

    public void setSekretaris(Mahasiswa in_datasekretaris) {
        this.sekretaris = in_datasekretaris;
    }

    @Override
    public void ikutlomba(Juara[] juara) {
        this.daftarjuara=juara;
    }

    @Override
    double hitungiuran() {
       return 0;
    }
}
