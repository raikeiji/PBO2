package Minggu7;

import java.util.Locale;
import javax.swing.JFrame;

public class Stats {
    public static void main(String[] args) {
        JFrame windows=new JFrame("Kalkulator Statistik Sederhana");
        StatsPanel content=new StatsPanel();
        windows.setContentPane(content);
        windows.pack();
        windows.setLocationRelativeTo(null); 
        windows.setSize(400,200);
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.setVisible(true);
    }
}
