package Minggu4.coba.Modul4;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MasyarakatDialog extends JDialog {

    private JLabel namalabel;
    private JTextField namafield;
    private JLabel tempatTanggalLahirLabel;
    private JTextField tempatTanggalLahirField;
    private JLabel nomorLabel;
    private JTextField nomorField;
    JButton sim;
    JButton res;
    JButton kel;

    public MasyarakatDialog() {
        this.setTitle("Masyarakat Dialog");
        this.setSize(400, 200);
        this.setLayout(new GridLayout(6, 2));
        namalabel = new JLabel("Nama");
        tempatTanggalLahirLabel = new JLabel("Tempat/Tanggal Lahir");
        nomorLabel = new JLabel("Nomor");
        namafield = new JTextField();
        tempatTanggalLahirField = new JTextField();
        nomorField = new JTextField();
        sim = new JButton("simpan");

        res = new JButton("reset");
        kel = new JButton("keluar");
        this.add(namalabel);
        this.add(namafield);
        this.add(tempatTanggalLahirLabel);
        this.add(tempatTanggalLahirField);
        this.add(nomorLabel);
        this.add(nomorField);
        this.add(sim);
        this.add(res);
        this.add(kel);
    }
}