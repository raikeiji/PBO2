/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu4.coba;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author admin
 */
public class MahasiswaDialog extends JDialog{
    private JLabel namalabel;
    private JTextField namafield;
    private JLabel tempatTanggalLahirLabel;
    private JTextField tempatTanggalLahirField;
    private JLabel nimLabel;
    private JTextField nimField;

    public MahasiswaDialog() {
        this.setSize(200, 100);   
        this.setLayout(new GridLayout(3,2));
        namalabel=new JLabel("Nama");        
        tempatTanggalLahirLabel=new JLabel("Tempat/Tanggal Lahir");
        nimLabel=new JLabel("NIM");
        namafield=new JTextField();
        tempatTanggalLahirField=new JTextField();
        nimField=new JTextField();
        
        this.add(namalabel);
        this.add(namafield);
        this.add(tempatTanggalLahirLabel);
        this.add(tempatTanggalLahirField);
        this.add(nimLabel);
        this.add(nimField);
        
    }
}
