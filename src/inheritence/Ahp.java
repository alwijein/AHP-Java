package inheritence;

public class Ahp {
    private double rating;
    private String klasifikasi;

    public void setRating(int rating){
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
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + rating);
        }
    }

    public void setKlasifikasi(int klasifikasi){
        switch(klasifikasi){
            case 1: this.klasifikasi = "Sangat Kurang";
                break;
            case 2: this.klasifikasi = "Kurang";
                break;
            case 3: this.klasifikasi = "Cukup";
                break;
            case 4: this.klasifikasi = "Baik";
                break;
            case 5: this.klasifikasi = "Sangat Baik";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + klasifikasi);
        }
    }

    public double getRating() {
        return rating;
    }

    public String getKlasifikasi() {
        return klasifikasi;
    }
}
