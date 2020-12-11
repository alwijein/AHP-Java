package inheritence;

import com.sun.jndi.ldap.Ber;
import inheritence.Ahp;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Ahp ahp = new Ahp();
        TesTulis tesTulis = new TesTulis();
        Berkas berkas = new Berkas();
        int hasilTulsi = 30;
        double hasil = tesTulis.setTesTulis(hasilTulsi) * tesTulis.getRating();
        System.out.println(hasil);
    }
}
