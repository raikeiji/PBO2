/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu4.coba;

import java.awt.GridLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class MasyarakatDialog extends JDialog{
    private JLabel namalabel;
    private JTextField namafield;
    private JLabel tempatTanggalLahirLabel;
    private JTextField tempatTanggalLahirField;
    private JLabel nomorLabel;
    private JTextField nomorField;

    public MasyarakatDialog() {
        this.setSize(200, 100);   
        this.setLayout(new GridLayout(3,2));
        namalabel=new JLabel("Nama");        
        tempatTanggalLahirLabel=new JLabel("Tempat/Tanggal Lahir");
        nomorLabel=new JLabel("Nomor");
        namafield=new JTextField();
        tempatTanggalLahirField=new JTextField();
        nomorField=new JTextField();
        
        this.add(namalabel);
        this.add(namafield);
        this.add(tempatTanggalLahirLabel);
        this.add(tempatTanggalLahirField);
        this.add(nomorLabel);
        this.add(nomorField);
    }    
}
