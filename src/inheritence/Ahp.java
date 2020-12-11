package inheritence;

public class Ahp {
    double rating;
    String klasifikasi;

    public double setRating(int rating){
        double x = 0;
        switch(rating){
            case 1: x = 0;
            break;
            case 2: x = 0.25;
            break;
            case 3: x = 0.5;
            break;
            case 4: x = 0.75;
            break;
            case 5: x = 1;
        }
        this.rating = x;
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
