package inheritence;

public class Berkas extends Ahp{
    int berkas;
    public int setBerkas(int berkas){
        if (berkas > 85){
            setRating(5);
        }else if (berkas >= 70 && berkas <= 85){
            setRating(4);
        }else if (berkas >= 60 && berkas <= 69){
            setRating(3);
        }else if (berkas >= 50 && berkas <= 59){
            setRating(2);
        }else{
            setRating(1);
        }
        this.berkas = berkas;
        return this.berkas;
    }
}
