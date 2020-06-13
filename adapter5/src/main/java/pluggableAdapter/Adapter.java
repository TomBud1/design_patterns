package pluggableAdapter;

public class Adapter implements IKartaTechniczna, ITechnicCard {

    private KartaTechniczna kartaTechniczna;
    private TechnicCard technicCard;
    private int cardType;

    public Adapter(KartaTechniczna kartaTechniczna) {
        cardType = 1;
        this.kartaTechniczna = kartaTechniczna;
    }

    public Adapter(TechnicCard technicCard) {
        cardType = 2;
        this.technicCard = technicCard;
    }


    @Override
    public String getModel() {
        if (cardType == 1){
            return this.kartaTechniczna.getNazwa();
        } else {
            return this.technicCard.getModel();
        }

    }

    @Override
    public double getHeightInInches() {
        if (cardType == 1){
            return this.kartaTechniczna.getWysokoscM() * 39.37;
        } else {
            return this.technicCard.getHeightInInches();
        }

    }
    @Override
    public double getWidthInInches() {
        if (cardType == 1){
            return this.kartaTechniczna.getSzerokoscM() * 39.37;
        } else {
            return this.technicCard.getWidthInInches();
        }

    }
    @Override
    public double getLengthInInches() {
        if (cardType == 1){
            return this.kartaTechniczna.getDlugoscM() * 39.37;
        } else {
            return this.technicCard.getLengthInInches();
        }

    }

    @Override
    public double getWeightInPounds() {
        if (cardType == 1){
            return this.kartaTechniczna.getWagaKg() * 2.2;
        } else {
            return this.technicCard.getWeightInPounds();
        }
    }

    @Override
    public String getNazwa() {
        if (cardType == 1){
            return this.kartaTechniczna.getNazwa();
        } else {
            return this.technicCard.getModel();
        }
    }

    @Override
    public double getWysokoscM() {
        if (cardType == 1){
            return this.kartaTechniczna.getWysokoscM();
        } else {
            return this.technicCard.getHeightInInches() * 0.0254;
        }
    }

    @Override
    public double getSzerokoscM() {
        if (cardType == 1){
            return this.kartaTechniczna.getSzerokoscM();
        } else {
            return this.technicCard.getWidthInInches() * 0.0254;
        }
    }

    @Override
    public double getDlugoscM() {
        if (cardType == 1){
            return this.kartaTechniczna.getDlugoscM();
        } else {
            return this.technicCard.getLengthInInches()* 0.0254;
        }
    }

    @Override
    public double getWagaKg() {
        if (cardType == 2){
            return this.technicCard.getWeightInPounds() * 0.4535923;
        } else {
            return this.kartaTechniczna.getWagaKg();
        }
    }

    @Override
    public void wyswietl() {
        if (cardType == 1){
            this.kartaTechniczna.wyswietl();
        } else {
            System.out.println(
                    "KARTA TECHNICZNA" + "\n"
                            + "Nazwa: " + getNazwa() + "\n"
                            + "Wysokosc: " + getWysokoscM() + "\n"
                            + "Szerokosc: " + getSzerokoscM() + "\n"
                            + "Dlugosc: " + getDlugoscM() + "\n"
                            + "Waga: " + getWagaKg()
            );
        }
    }


    @Override
    public void display() {
        if (cardType == 1){
            System.out.println(
                    "TECHNIC CARD" + "\n"
                            + "Model: " + getModel() + "\n"
                            + "Height: " + getHeightInInches() + "\n"
                            + "Width: " + getWidthInInches() + "\n"
                            + "Length: " + getLengthInInches() + "\n"
                            + "Weight: " + getWeightInPounds()
            );
        } else {
            this.technicCard.display();
        }

    }
}

