/*
 * Nama : Engelbertus Vioen
 * NIM : 125314112
 * program ini menggunakan kelas KomputerString, tetapi tidak berhasil dijalankan
 */
package uts2_125314112;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author made
 */
public class KomputerFrame_Error extends JFrame {

    private JLabel lableid, lablenama, lablemerk, lableharga;
    private JTextField fieldid, fieldnama, fieldmerk, fieldharga;
    private JButton buttonsave, buttonopen, buttonreset, buttonexit;

    public KomputerFrame_Error() {
        setTitle("Komputer Frame");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2));

        lableid = new JLabel("Id");
        lablenama = new JLabel("Nama");
        lablemerk = new JLabel("Merk");
        lableharga = new JLabel("Harga");

        fieldid = new JTextField();
        fieldnama = new JTextField();
        fieldmerk = new JTextField();
        fieldharga = new JTextField();

        buttonsave = new JButton("Save");
        buttonsave.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                //String namafile="komputer.txt";
                File namafile = new File("komputer.txt");
                try {
                    if (!namafile.exists()) {
                        namafile.createNewFile();
                    }
                    FileWriter filewriter = new FileWriter(namafile.getAbsoluteFile());
                    BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
                    
                    try {
                        KomputerString k=new KomputerString();
                        k.setId(fieldid.getText());
                        k.setNama(fieldnama.getText());
                        k.setMerk(fieldmerk.getText());
                        k.setHarga(fieldharga.getText());
                        bufferedwriter.write(k.getId() + "##"
                            + k.getNama() + "##"
                            + k.getMerk() + "##"
                            + k.getHarga());
                    } catch (Exception e) {
                    }
                    
                    bufferedwriter.close();
                    JOptionPane.showMessageDialog(null, "Data telah ditambahkan");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        buttonopen = new JButton("Open");
        buttonopen.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String namafile = "komputer.txt";
                byte[] buffer = new byte[1000];
                try {
//                    FileInputStream inputstream=new FileInputStream(namafile);
//                    int total=0;
//                    int nRead=0;
//                    while((nRead=inputstream.read(buffer))!=-1){
//                        String[] values=namafile.split("##");
//                        //JOptionPane.showMessageDialog(null, new String(buffer));
//                        JOptionPane.showMessageDialog(null, "No Komp : "+values[0]);
//                        total+=nRead;
//                    }
//                    inputstream.close();
                    FileInputStream fstream = new FileInputStream(namafile);
                    DataInputStream in = new DataInputStream(fstream);
                    BufferedReader br = new BufferedReader(new InputStreamReader(in));
                    String strLine;

                    while ((strLine = br.readLine()) != null) {
                        String[] splitout = strLine.split("##");
//                        for (String token:splitout) {
//                            System.out.println(token);
//                            
//                        }
                        JOptionPane.showMessageDialog(null, "No Komp       : " + splitout[0]
                                + "\nNama Komputer : " + splitout[1]
                                + "\nMerk          : " + splitout[2]
                                + "\nHarga         : " + splitout[3]);
                    }
                    in.close();
                } catch (Exception e) {
                }

            }
        });
        buttonreset = new JButton("Reset");
        buttonreset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                fieldid.setText("");
                fieldnama.setText("");
                fieldmerk.setText("");
                fieldharga.setText("");
            }
        });
        buttonexit = new JButton("Exit");
        buttonexit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        this.add(lableid);
        this.add(fieldid);
        this.add(lablenama);
        this.add(fieldnama);
        this.add(lablemerk);
        this.add(fieldmerk);
        this.add(lableharga);
        this.add(fieldharga);
        this.add(buttonsave);
        this.add(buttonopen);
        this.add(buttonreset);
        this.add(buttonexit);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                KomputerFrame_Error k = new KomputerFrame_Error();
                k.setVisible(true);
            }
        });
    }
}
