package inheritence;

public class MakalahPresentasi extends Ahp{
    int makalahPresentasi;

    public int setMakalahPresentasi(int makalahPresentasi){
        if (makalahPresentasi > 85){
            setRating(5);
        }else if (makalahPresentasi >= 70 && makalahPresentasi <= 85){
            setRating(4);
        }else if (makalahPresentasi >= 60 && makalahPresentasi <= 69){
            setRating(3);
        }else if (makalahPresentasi >= 50 && makalahPresentasi <= 59){
            setRating(2);
        }else{
            setRating(1);
        }
        this.makalahPresentasi = makalahPresentasi;
        return this.makalahPresentasi;
    }
}
