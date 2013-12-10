package Modul9.Tugas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MasyarakatDialog extends JDialog implements ActionListener {

    private JLabel namalabel;
    private JTextField namafield;
    private JLabel tempatTanggalLahirLabel;
    private JTextField tempatTanggalLahirField;
    private JLabel nomorLabel;
    private JTextField nomorField;
    private JLabel jumlahiuranLabel;
    private JTextField jumlahiuranField;
    private JLabel UKMLabel;
    private JTextField UKMField;
    JButton sim;
    JButton res;
    JButton kel;

    public MasyarakatDialog() {
        this.setTitle("Masyarakat Dialog");
        this.setSize(400, 200);
        this.setLayout(new GridLayout(8, 2));
        namalabel = new JLabel("Nama");
        tempatTanggalLahirLabel = new JLabel("Tempat/Tanggal Lahir");
        nomorLabel = new JLabel("Nomor");
        jumlahiuranLabel = new JLabel("Jumlah iuran");
        UKMLabel = new JLabel("Nama UKM");
        namafield = new JTextField();
        tempatTanggalLahirField = new JTextField();
        nomorField = new JTextField();
        jumlahiuranField = new JTextField();
        UKMField = new JTextField();
        sim = new JButton("simpan");
        sim.addActionListener(this);
        res = new JButton("reset");
        res.addActionListener(this);
        kel = new JButton("keluar");
        kel.addActionListener(this);
        this.add(namalabel);
        this.add(namafield);
        this.add(tempatTanggalLahirLabel);
        this.add(tempatTanggalLahirField);
        this.add(nomorLabel);
        this.add(nomorField);
        this.add(jumlahiuranLabel);
        this.add(jumlahiuranField);
        this.add(UKMLabel);
        this.add(UKMField);
        this.add(sim);
        this.add(res);
        this.add(kel);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == res) {
            namafield.setText(" ");
            tempatTanggalLahirField.setText("");
            nomorField.setText(" ");
            jumlahiuranField.setText(" ");
            UKMField.setText(" ");
        } else if (ae.getSource() == kel) {
            this.dispose();
        } else if (ae.getSource() == sim) {
            JOptionPane.showMessageDialog(null, "Nama : " + namafield.getText() + "\n"
                    + "TTL : " + tempatTanggalLahirField.getText() + "\n" 
                    + "Nomor : " + nomorField.getText()
                    +"\njumlah iuran : "+jumlahiuranField.getText()
                    +"\nNama UKM : "+UKMField.getText());
        }
    }
}
