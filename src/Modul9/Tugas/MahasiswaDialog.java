//reuseability(program hanya sekali dibuat)
package Modul9.Tugas;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MahasiswaDialog extends JDialog {

    private JLabel namalabel;
    private JTextField namafield;
    private JLabel TanggalLahirLabel;
    private JTextField tanggal;
    private JTextField bulan;
    private JTextField tahun;
    private JLabel nimLabel;
    private JTextField nimField;
    private JLabel jumlahiuranLabel;
    private JTextField jumlahiuranField;
    private JLabel UKMLabel;
    private JTextField UKMField;
    JButton sim;
    JButton res;
    JButton kel;

    public MahasiswaDialog() {
        this.setTitle("Mahasiswa Dialog");
        this.setSize(500, 300);

        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        tanggal = new JTextField(2);
        bulan = new JTextField(2);
        tahun = new JTextField(4);

        this.setLayout(new GridLayout(10, 1));

        namalabel = new JLabel("Nama");
        TanggalLahirLabel = new JLabel("Tanggal Lahir");
        nimLabel = new JLabel("NIM");
        jumlahiuranLabel = new JLabel("Jumlah iuran");
        UKMLabel = new JLabel("Nama UKM");

        namafield = new JTextField();
        nimField = new JTextField();
        jumlahiuranField = new JTextField();
        UKMField = new JTextField();

        sim = new JButton("simpan");
        sim.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                mahasiswaaction();
//                Mahasiswa m = new Mahasiswa();
//                String nama  = "Nama    : " + m.getNama();
//                String TTL   = "Tanggal : " + m.getTgl();
//                String Bln   = "Bulan   : " + m.getBulan();
//                String Thn   = "Tahun   : " + m.getTahun();
//                String nim   = "NIM     : " + m.getNim();
//                String iuran = "Iuran   : " + m.getIuran();
//                String UKM   = "UKM     : " + m.getNamaukm();
//                namafield.setText(nama);
                
            }
        });
        res = new JButton("reset");
        res.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                namafield.setText(" ");

                nimField.setText(" ");
                jumlahiuranField.setText(" ");
                UKMField.setText(" ");
            }
        });
        kel = new JButton("keluar");
        kel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        this.add(namalabel);
        this.add(namafield);
        this.add(panel);
        panel.add(TanggalLahirLabel);
        panel.add(tanggal);
        panel.add(bulan);
        panel.add(tahun);

        this.add(nimLabel);
        this.add(nimField);
        this.add(jumlahiuranLabel);
        this.add(jumlahiuranField);
        this.add(UKMLabel);
        this.add(UKMField);
        this.add(panel2);
        panel2.add(sim);
        panel2.add(res);
        panel2.add(kel);
    }
    private void mahasiswaaction() {
        try {
            Mahasiswa m = new Mahasiswa();
            m.setNama(namafield.getText());
            m.setTgl(tanggal.getText());
            m.setBulan(bulan.getText());
            m.setTahun(tahun.getText());
            m.setNim(nimField.getText());
            m.setIuran(jumlahiuranField.getText());
            m.setNamaukm(UKMField.getText());
            JOptionPane.showMessageDialog(null, 
                    "Nama  : "+m.getNama()+
                    "TTL   : "+m.getTgl()+"/"+m.getBulan()+"/"+m.getTahun()+
                    "NIM   : "+m.getNim()+
                    "Iuran : "+m.getNim()+
                    "UKM   : "+m.getNamaukm());
        } catch (Exception ex) {
            System.err.println("htf");
        }
    }
}
