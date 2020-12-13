package inheritence;

import com.sun.jndi.ldap.Ber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class AppGui extends JFrame{

    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton inputButton;
    private JLabel masukkanNilai;
    private JLabel textMain;


    public AppGui(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
        JFrame f = new JFrame();
        Ahp ahp = new Ahp();
        TesTulis tesTulis = new TesTulis();
        Berkas berkas = new Berkas();
        MakalahPresentasi makalahPresentasi = new MakalahPresentasi();
        Wawancara wawancara = new Wawancara();

        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int inputTesTulis = Integer.parseInt(textField1.getText());
                int inputBerkas = Integer.parseInt(textField2.getText());
                int inputMakalahPresentasi = Integer.parseInt(textField3.getText());
                int inputWawancara = Integer.parseInt(textField4.getText());

                double hasil = ((tesTulis.setTesTulis(inputTesTulis)*tesTulis.getRating())+(berkas.setBerkas(inputBerkas)*berkas.getRating()+(makalahPresentasi.setMakalahPresentasi(inputMakalahPresentasi)*makalahPresentasi.getRating())+(wawancara.setWawancara(inputWawancara)+wawancara.getRating())))/4;
                if (!(hasil > 70)) {
                        JOptionPane.showMessageDialog(f,"Maaf Anda Dinyatakan Tidak Lulus Dalam Penerimaan Calon Asisten Dengan Nilai" + hasil);
                }else if (hasil >= 70){
                    JOptionPane.showMessageDialog(f,"Selamat Anda Dinyatakan Lulus Dalam Penerimaan Calon Asisten Dengan Nilai " + hasil);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new AppGui("AHP Java");
        frame.setVisible(true);


    }
}
