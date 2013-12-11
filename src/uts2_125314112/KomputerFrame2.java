/*
 * Nama : Engelbertus Vioen
 * NIM : 125314112
 * program ini tidak menggunakan kelas KomputerString, tetapi berhasil dijalankan
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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author made
 */
public class KomputerFrame2 extends JFrame {

    private JLabel lableid, lablenama, lablemerk, lableharga;
    private JTextField fieldid, fieldnama, fieldmerk, fieldharga;
    private JButton buttonsave, buttonopen, buttonreset, buttonexit;

    public KomputerFrame2() {
        setDesign();
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
                File namafile = new File("komputer2.txt");
                try {
//                    if (!namafile.exists()) {
//                        namafile.createNewFile();
//                    }
                    FileWriter filewriter = new FileWriter(namafile.getAbsoluteFile(),true);
                    BufferedWriter bufferedwriter = new BufferedWriter(filewriter);

                    String var;
                    var = fieldid.getText() + "##"
                            + fieldnama.getText() + "##"
                            + fieldmerk.getText() + "##"
                            + fieldharga.getText();
                    bufferedwriter.append(var);
                    bufferedwriter.newLine();
                    
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
                String namafile = "komputer2.txt";
                byte[] buffer = new byte[1000];
                try {
//                    FileInputStream fstream = new FileInputStream(namafile);
//                    DataInputStream in = new DataInputStream(fstream);
                    FileReader fread=new FileReader(namafile);
                    BufferedReader br = new BufferedReader(fread);
                    String strLine;

                    while ((strLine = br.readLine()) != null) {
                        String[] splitout = strLine.split("##");
                        JOptionPane.showMessageDialog(null, "No Komp       : " + splitout[0]
                                + "\nNama Komputer : " + splitout[1]
                                + "\nMerk          : " + splitout[2]
                                + "\nHarga         : " + splitout[3]);
                    }
                    br.close();
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
   public final void setDesign(){
       try {
           //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
           //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
           //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
           //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifCheckBoxMenuItemUI");
           //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifButtonUI");
           //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
           
       } catch (Exception e) {
       }
   }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                KomputerFrame2 k = new KomputerFrame2();
                k.setVisible(true);
            }
        });
    }
}
