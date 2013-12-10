/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu4.coba;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class UKMDialog extends JDialog {

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

    public UKMDialog() {
        namalabel = new JLabel();
        namaField = new JTextField();
        
    }
}
