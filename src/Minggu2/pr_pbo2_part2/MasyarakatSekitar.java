package Minggu2.pr_pbo2_part2;
public class MasyarakatSekitar extends Penduduk{
    private String nomor;

    public MasyarakatSekitar() {
    }

    public MasyarakatSekitar(String in_dataNis, String in_dataNama, 
            String in_dataTempatTanggalLahir) {
        setNama(in_dataNama);
        setTempatTanggalLahir(in_dataTempatTanggalLahir);
        nomor=in_dataNis;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String in_datanomor) {
        this.nomor = in_datanomor;
    }
    @Override
    public double hitungiuran(){
        return Double.parseDouble(nomor.substring(2))*100;
    }
}
