package Minggu3;
public class Juara {
    String namaKejuaraan;
    String prestasikejuaraan;

    public Juara() {
    }

    public Juara(String namaKejuaraan, String prestasikejuaraan) {
        this.namaKejuaraan = namaKejuaraan;
        this.prestasikejuaraan = prestasikejuaraan;
    }

    public String getNamaKejuaraan() {
        return namaKejuaraan;
    }

    public void setNamaKejuaraan(String namaKejuaraan) {
        this.namaKejuaraan = namaKejuaraan;
    }

    public String getPrestasikejuaraan() {
        return prestasikejuaraan;
    }

    public void setPrestasikejuaraan(String prestasikejuaraan) {
        this.prestasikejuaraan = prestasikejuaraan;
    }
    
}
