package Minggu3;
public abstract class Penduduk {
    private String nama, tempatTanggalLahir;

    public Penduduk() {
    }

    public Penduduk(String in_datanama, String in_datatempatTanggalLahir) {
        this.nama = in_datanama;
        this.tempatTanggalLahir = in_datatempatTanggalLahir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String in_datanama) {
        this.nama = in_datanama;
    }

    public String getTempatTanggalLahir() {
        return tempatTanggalLahir;
    }

    public void setTempatTanggalLahir(String in_datatempatTanggalLahir) {
        this.tempatTanggalLahir = in_datatempatTanggalLahir;
    }
    abstract double hitungiuran();
}
