package Modul9.Tugas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class UKMFrame extends JFrame implements ActionListener{
    private JMenuBar bar;
    private JMenu editMenu;
    private JMenu helpmenu;
    private JMenuItem tambahMahasiswaItem;
    private JMenuItem tambahMasyarakatItem;
    private JMenuItem tambahUKMItem;

    public UKMFrame() {
        this.setTitle("UKM Frame");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bar=new JMenuBar();
        editMenu=new JMenu("Edit");
        helpmenu=new JMenu("Help");
        tambahMahasiswaItem=new JMenuItem("Tambah Mahasiswa");
        tambahMasyarakatItem=new JMenuItem("Tambah Masyarakat Sekitar");
        tambahUKMItem=new JMenuItem("Tambah UKM");
        
        editMenu.add(tambahMahasiswaItem);
        editMenu.add(tambahMasyarakatItem);
        editMenu.add(tambahUKMItem);
        bar.add(editMenu);
        bar.add(helpmenu);
        
        tambahMahasiswaItem.addActionListener(this);
        tambahMasyarakatItem.addActionListener(this);
        tambahUKMItem.addActionListener(this);
        
        this.setJMenuBar(bar);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==tambahMahasiswaItem){
            MahasiswaDialog mhs=new MahasiswaDialog();
            mhs.setVisible(true);
        }
        else if(ae.getSource()==tambahMasyarakatItem){
            MasyarakatDialog mas=new MasyarakatDialog();
            mas.setVisible(true);
        }
        else{
            UKMDialog ukm=new UKMDialog();
            ukm.setVisible(true);
        }
    }
}
