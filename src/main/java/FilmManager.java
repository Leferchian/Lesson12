public class FilmManager {
    private PurchaseFilm[] films = new PurchaseFilm[0];
    int limit =10;

    public FilmManager (int limit){
        this.limit=limit;
    }

    public FilmManager (){

    }

    public void save(PurchaseFilm film){
        PurchaseFilm[] tmp = new PurchaseFilm[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public PurchaseFilm[] getFilms(){
        return films;
    }

    public PurchaseFilm[] getLast() {
        PurchaseFilm[] tmp = films;
        PurchaseFilm[] reversed = new PurchaseFilm[limit];
        for (int i=0; i < limit; i++){
            reversed[i]=tmp[tmp.length-i-1];
        }
        return reversed;
    }
}