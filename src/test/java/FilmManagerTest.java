import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FilmManagerTest {

    PurchaseFilm item1 = new PurchaseFilm(1, 13, "Бегущий человек", 600);
    PurchaseFilm item2 = new PurchaseFilm(2, 14, "Бегущий человек 2", 610);
    PurchaseFilm item3 = new PurchaseFilm(3, 15, "Бегущий человек 3", 620);
    PurchaseFilm item4 = new PurchaseFilm(4, 16, "Блэйд", 630);
    PurchaseFilm item5 = new PurchaseFilm(5, 17, "Блэйд 2", 640);
    PurchaseFilm item6 = new PurchaseFilm(6, 18, "Блэйд 3", 650);
    PurchaseFilm item7 = new PurchaseFilm(7, 19, "Блэйд 4", 660);
    PurchaseFilm item8 = new PurchaseFilm(8, 20, "киндзадза", 670);
    PurchaseFilm item9 = new PurchaseFilm(9, 21, "Годзила", 680);
    PurchaseFilm item10 = new PurchaseFilm(10, 22, "Бегущий по лезвию", 700);
    PurchaseFilm item11 = new PurchaseFilm(11, 23, "Бегущий в лабиринте", 730);
    PurchaseFilm item12 = new PurchaseFilm(12, 24, "Дивиргент", 720);
    PurchaseFilm item13 = new PurchaseFilm(13, 25, "Дом у озера", 710);


    @Test
    public void testSave() {
        FilmManager man = new FilmManager();
        man.save(item1);
        man.save(item2);
        man.save(item3);
        man.save(item4);
        man.save(item5);
        man.save(item6);
        man.save(item7);
        man.save(item8);
        man.save(item9);
        man.save(item10);
        man.save(item11);
        man.save(item12);
        man.save(item13);

        PurchaseFilm[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12, item13};
        PurchaseFilm[] actual = man.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldReverseThisStandardLimit() {
        FilmManager man = new FilmManager();
        man.save(item1);
        man.save(item2);
        man.save(item3);
        man.save(item4);
        man.save(item5);
        man.save(item6);
        man.save(item7);
        man.save(item8);
        man.save(item9);
        man.save(item10);
        man.save(item11);
        man.save(item12);
        man.save(item13);

        PurchaseFilm[] expected = {item13, item12, item11, item10, item9, item8, item7, item6, item5, item4};
        PurchaseFilm[] actual = man.getLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    void shouldReverseThisSetLimit() {
        FilmManager man = new FilmManager(5);
        man.save(item1);
        man.save(item2);
        man.save(item3);
        man.save(item4);
        man.save(item5);
        man.save(item6);
        man.save(item7);
        man.save(item8);
        man.save(item9);
        man.save(item10);
        man.save(item11);
        man.save(item12);
        man.save(item13);

        PurchaseFilm[] expected = {item13, item12, item11, item10, item9};
        PurchaseFilm[] actual = man.getLast();

        Assertions.assertArrayEquals(expected, actual);


    }
}