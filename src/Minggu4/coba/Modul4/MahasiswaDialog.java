package Minggu4.coba.Modul4;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class MahasiswaDialog extends JDialog {

    private JLabel namalabel;
    private JTextField namafield;
    private JLabel tempatTanggalLahirLabel;
    private JTextField tempatTanggalLahirField;
    private JLabel nimLabel;
    private JTextField nimField;
    JButton sim;
    JButton res;
    JButton kel;

    public MahasiswaDialog() {
        this.setTitle("Mahasiswa Dialog");
        this.setSize(400, 200);
        this.setLayout(new GridLayout(6, 2));
        namalabel = new JLabel("Nama");
        tempatTanggalLahirLabel = new JLabel("Tempat/Tanggal Lahir");
        nimLabel = new JLabel("NIM");
        namafield = new JTextField();
        tempatTanggalLahirField = new JTextField();
        nimField = new JTextField();
        sim = new JButton("simpan");
        res = new JButton("reset");
        kel = new JButton("keluar");
        this.add(namalabel);
        this.add(namafield);
        this.add(tempatTanggalLahirLabel);
        this.add(tempatTanggalLahirField);
        this.add(nimLabel);
        this.add(nimField);
        this.add(sim);
        this.add(res);
        this.add(kel);
    }
}
