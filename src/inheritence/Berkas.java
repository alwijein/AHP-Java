package inheritence;

public class Berkas extends Ahp{
    int berkas;
    public int setBerkas(int berkas){
        if (berkas > 85){
            this.berkas = 5;
        }else if (berkas >= 70 || berkas <= 85){
            this.berkas = 4;
        }else if (berkas >= 60 || berkas <= 69){
            this.berkas = 3;
        }else if (berkas >= 50 || berkas <= 59){
            this.berkas = 2;
        }else{
            this.berkas = 1;
        }
        return this.berkas;
    }
}
