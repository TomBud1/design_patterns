package pluggableAdapter;

public class MainApp {
    public static void main(String[] args)
    {
                KartaTechniczna kartaTechniczna = new KartaTechniczna("Paczka", 2.00, 1.50 , 1 , 150);
                TechnicCard technicCard = new TechnicCard("Package", 78.74, 59.05499999999999 , 39.37, 330 );

                Adapter kartaTechnicznaToTechnicCard = new Adapter(kartaTechniczna);
                Adapter TechnicCardDoKartaTechniczna = new Adapter(technicCard);

                System.out.println("--------------------------------------------------");
                kartaTechnicznaToTechnicCard.wyswietl();
                System.out.println("--------------------------------------------------");
                kartaTechnicznaToTechnicCard.display();
                System.out.println("--------------------------------------------------");
                TechnicCardDoKartaTechniczna.wyswietl();
                System.out.println("------------------------");
                TechnicCardDoKartaTechniczna.display();
    }
}
