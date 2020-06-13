package pluggableAdapter;


public class KartaTechniczna implements IKartaTechniczna {

    private String nazwa;
    private double wysokosc;
    private double szerokosc;
    private double dlugosc;
    private double waga;

    public KartaTechniczna(String nazwa, double wysokosc, double dlugosc, double szerokosc, double waga) {
        this.nazwa = nazwa;
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
        this.waga = waga;
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }

    @Override
    public double getWysokoscM() {
        return wysokosc;
    }

    @Override
    public double getSzerokoscM() {
        return szerokosc;
    }

    @Override
    public double getDlugoscM() {
        return dlugosc;
    }

    @Override
    public double getWagaKg() {
        return waga;
    }

    @Override
    public void wyswietl() {
        System.out.println(
                "Karta Techniczna" + "\n"
                        + "Nazwa: " + nazwa + "\n"
                        + "Wyskosc: " + wysokosc + "\n"
                        + "Szerokosc: " + szerokosc + "\n"
                        + "Dlugosc: " + dlugosc + "\n"
                        + "Waga: " + waga
        );
    }
}

