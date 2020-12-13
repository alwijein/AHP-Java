package inheritence;

public class Wawancara extends Ahp{
    int wawancara;

    public int setWawancara(int wawancara){
        if (wawancara > 85){
            setRating(5);
        }else if (wawancara >= 70 && wawancara <= 85){
            setRating(4);
        }else if (wawancara >= 60 && wawancara <= 69){
            setRating(3);
        }else if (wawancara >= 50 && wawancara <= 59){
            setRating(2);
        }else{
            setRating(1);
        }
        this.wawancara = wawancara;
        return this.wawancara;
    }
}
