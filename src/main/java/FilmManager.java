public class FilmManager {
    private int limit;
    private PurchaseFilm[] films = new PurchaseFilm[0];

    public FilmManager() {
        this.limit = 10;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void save(PurchaseFilm film) {
        PurchaseFilm[] tmp = new PurchaseFilm[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public PurchaseFilm[] getFilms() {
        return films;
    }

    public PurchaseFilm[] getLast() {
        int lengthOfFilms;
        lengthOfFilms = Math.min(films.length, this.limit);
        PurchaseFilm[] reversed = new PurchaseFilm[lengthOfFilms];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = films[films.length - i - 1];
        }
        return reversed;
    }
}