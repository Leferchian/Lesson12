public class PurchaseFilm {
    private int id;
    private int filmId;
    private String filmName;
    private int filmPrice;


    public PurchaseFilm(int id, int filmId, String filmName, int filmPrice) {
        this.id = id;
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmPrice = filmPrice;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getFilmPrice() {
        return filmPrice;
    }

    public void setFilmPrice(int filmPrice) {
        this.filmPrice = filmPrice;
    }

}