package inheritence;

public class TesTulis extends Ahp{
    private int  tesTulis;

    public void setTesTulis(int tesTulis) {
        if (tesTulis > 85) {
            setRating(5);
        } else if (tesTulis >= 70 && tesTulis <= 85) {
            setRating(4);
        } else if (tesTulis >= 60 && tesTulis <= 69) {
            setRating(3);
        } else if (tesTulis >= 50 && tesTulis <= 59) {
            setRating(2);
        } else {
            setRating(1);
        }
        this.tesTulis = tesTulis;
    }

    public int getTesTulis() {
        return tesTulis;
    }
}
