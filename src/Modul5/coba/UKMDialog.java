package Modul5.coba;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UKMDialog extends JDialog implements ActionListener {

    private JLabel namalabel;
    private JTextField namaField;
    private JLabel ketuaLabel;
    private JComboBox ketuaCombo;
    private JLabel sekretarisLabel;
    private JComboBox sekretarisCombo;
    private JLabel anggotaLabel;
    private JList anggotaList;
    private JLabel juaraLabel;
    private JTextField juaraField;
    JButton sim;
    JButton res;
    JButton kel;

    public UKMDialog() {
        this.setTitle("UKM Dialog");
        this.setSize(400, 200);
        this.setLayout(new GridLayout(9, 2));
        String daftaranggota[] = {"Bayu", "Maria", "RUDI"};
        namalabel = new JLabel("Nama");
        namaField = new JTextField();
        
        ketuaLabel = new JLabel("ketua");
        ketuaCombo = new JComboBox();
        ketuaCombo.addItem("Adi");
        
        sekretarisLabel = new JLabel("Sekretaris ");
        sekretarisCombo = new JComboBox();
        sekretarisCombo.addItem("Maria");
        
        anggotaLabel = new JLabel("Anggota");
        anggotaList = new JList(daftaranggota);
        JScrollPane jsp = new JScrollPane(anggotaList);

        juaraLabel = new JLabel("Juara label");
        juaraField = new JTextField();
        
        sim = new JButton("simpan");
        sim.addActionListener(this);
        res = new JButton("reset");
        res.addActionListener(this);
        kel = new JButton("keluar");
        kel.addActionListener(this);

        this.add(namalabel);
        this.add(namaField);
        this.add(ketuaLabel);
        this.add(ketuaCombo);
        this.add(sekretarisLabel);
        this.add(sekretarisCombo);
        this.add(anggotaLabel);
        this.add(jsp);
        this.add(juaraLabel);
        this.add(juaraField);
        this.add(sim);
        this.add(res);
        this.add(kel);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == res) {
            namaField.setText(" ");
            juaraField.setText(" ");
        } else if (ae.getSource() == kel) {
            this.dispose();
        } else if (ae.getSource() == sim) {
            JOptionPane.showMessageDialog(null, "Nama : " + namaField.getText() +
                    "\n" + "Juara : " + juaraField.getText());
        }
    }
}
