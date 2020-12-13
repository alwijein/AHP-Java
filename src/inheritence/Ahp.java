package inheritence;

public class Ahp {
    double rating;
    String klasifikasi;

    public double setRating(int rating){
        switch(rating){
            case 1: this.rating = 0;
            break;
            case 2: this.rating = 0.25;
            break;
            case 3: this.rating = 0.5;
            break;
            case 4: this.rating = 0.75;
            break;
            case 5: this.rating = 1;
        }
        return this.rating;
    }

    public String setKlasifikasi(int klasifikasi){
        String x = "Sangat Kurang";
        switch(klasifikasi){
            case 1: x = "Sangat Kurang";
                break;
            case 2: x = "Kurang";
                break;
            case 3: x = "Cukup";
                break;
            case 4: x = "Baik";
                break;
            case 5: x = "Sangat Baik";
                break;
        }
        this.klasifikasi = x;
        return this.klasifikasi;
    }

    public double getRating() {
        return rating;
    }

    public String getKlasifikasi(int hasil) {
        return klasifikasi;
    }
}
