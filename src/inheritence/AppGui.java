package inheritence;

import com.sun.jndi.ldap.Ber;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class AppGui extends JFrame{

    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton inputButton;
    private JLabel tesTulis;
    private JLabel textMain;

    public AppGui(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();

        JFrame f = new JFrame();

        DecimalFormat df = new DecimalFormat("#.##");

        Ahp ahp = new Ahp();
        TesTulis tesTulis = new TesTulis();
        Berkas berkas = new Berkas();
        MakalahPresentasi makalahPresentasi = new MakalahPresentasi();
        Wawancara wawancara = new Wawancara();

        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //assignment variable dengan value dari masing-masing text field
                int inputTesTulis = Integer.parseInt(textField1.getText());
                int inputBerkas = Integer.parseInt(textField2.getText());
                int inputMakalahPresentasi = Integer.parseInt(textField3.getText());
                int inputWawancara = Integer.parseInt(textField4.getText());


                //pengisisan objek dari masing-masing class
                tesTulis.setTesTulis(inputTesTulis);
                berkas.setBerkas(inputBerkas);
                makalahPresentasi.setMakalahPresentasi(inputMakalahPresentasi);
                wawancara.setWawancara(inputWawancara);

                double hasil = ((tesTulis.getTesTulis()*tesTulis.getRating())+(berkas.getBerkas()*berkas.getRating()+(makalahPresentasi.getMakalahPresentasi()*makalahPresentasi.getRating())+(wawancara.getWawancara()+wawancara.getRating())))/4;
                if (!(hasil > 70)) {
                        JOptionPane.showMessageDialog(f,"Maaf Anda Dinyatakan Tidak Lulus Dalam Penerimaan Calon Asisten Dengan Nilai " + df.format(hasil));
                }else if (hasil >= 70){
                    JOptionPane.showMessageDialog(f,"Selamat Anda Dinyatakan Lulus Dalam Penerimaan Calon Asisten Dengan Nilai " + df.format(hasil));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new AppGui("AHP Java");
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
