package Minggu7;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StatsPanel extends JPanel {

    private JLabel judul, banyakdata, jumlahdata, rata2, deviasi;
    private JTextField masuk;
    private JButton enter, hapus;
    StateCalc s = new StateCalc();

    public StatsPanel() {
        JPanel p = new JPanel();
        this.setLayout(new GridLayout(6, 1));

        judul = new JLabel("Masukkan data lalu tekan enter:");
        banyakdata = new JLabel("Banyak data : ");
        jumlahdata = new JLabel("Jumlah data : ");
        rata2 = new JLabel("Rata-rata : ");
        deviasi = new JLabel("Deviasi Standar : ");
        masuk = new JTextField(20);
        enter = new JButton("enter");
        enter.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!masuk.getText().equalsIgnoreCase("") && masuk.getText() != null) {
                    s.enter(Double.parseDouble(masuk.getText()));
                    String sum2 = "Banyak data : " + s.getSum();
                    banyakdata.setText(sum2);
                    String count2 = "Jumlah data : " + s.getCount();
                    jumlahdata.setText(count2);
                    String ratarata = "Rata-rata : " + s.getMean();
                    rata2.setText(ratarata);
                    String standardebiasi = "Deviasi Standar : " + s.getstandardeviasi();
                    deviasi.setText(standardebiasi);
                } else {
                    System.out.println("Maaf gan belum terisi nih kolomnya");
                }

            }
        });
        hapus = new JButton("hapus");
        hapus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                masuk.setText(" ");
            }
        });
        this.add(judul);
        this.add(p);

        p.add(masuk);
        p.add(enter);
        p.add(hapus);
        this.add(banyakdata);
        this.add(jumlahdata);
        this.add(rata2);
        this.add(deviasi);
    }
}
