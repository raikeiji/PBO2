package Minggu2.pr_pbo2_part2;
public class Mahasiswa extends Penduduk{

    private String nim;

    public Mahasiswa() {
    }

    public Mahasiswa(String in_dataNim, String in_dataNama, String in_dataTtl) {
        setNama(in_dataNama);
        nim = in_dataNim;
        setTempatTanggalLahir(in_dataTtl);
    }    

    public String getNim() {
        return nim;
    }

    public void setNim(String in_dataNim) {
        this.nim = in_dataNim;
    }

    @Override
    public double hitungiuran(){
        return Double.parseDouble(nim)/10000;
    }
  
}
