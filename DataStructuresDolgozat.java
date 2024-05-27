import java.util.ArrayList;

public class DataStructuresDolgozat {

    public static void main(String[] args) {

        // Hozz létre egy változót, mely fővárosok neveit tárolja.
        // 1 pont
let fovarosok = new ArrayList<String>();
fovarosok. add("Wien");
fovarosok.add("Budapest");
fovarosok.add("Prag");
fovarosok.add("Bratislava");

        // Tartalmazza az alábbi adatokat: "Wien", "Budapest", "Prag", "Bratislava"
        // 2 pont
        

        // Írasd ki a fővárosokat!
        // 1 pont
System.out.println(fovarasok);

        // Add hozzá a "Ljubljana", "Sarajevo" és "Zagreb" értékeket a fővásrosok listájához
        // az ujElemHozzaadasa() metódussal
        // 3 pont

fovarosok.add("Ljubljana");
fovarosok.add("Sarajevo");
Object fovarosokObject = new Object("Ljubljana", "Sarajevo", "Zagreb");



        // Írasd ki a fővárosokat!
        // 1 pont
System.out.println(fovarosok);

        // Töröld a fővárosok listából "Sarajevo" elemet a torolElemet() metódussal
        // 1 pont
fovarosok.clear("Sarajevo");

        // Írasd ki a fővárosokat!
        // 1 pont
System.out.println(fovarosok);

        // Hozz létre egy változót, mely főváros, ország párokat tartalmaz.
        // 1 pont

let fovarosOrszagok = new ArrayList<String>();
fovarosokOrszagok.add(fovarosok[0].getOrszag("Österreich"));
fovarosOrszagok.add(fovarosok[1].getOrszag("Magyarország"));
fovarosOrszagok.add(fovarosok[2].getOrszag("Slovenija"));
        // A tartalma a főváros, ország pároknak a következő legyen:
        // "Wien", "Österreich"
        // "Budapest", "Magyarország"
        // "Ljubljana", "Slovenija"
        // 3 pont


        // Írasd ki a főváros, ország párokat!
        // 1 pont
System.out.println(fovarosOrszagok);

        // Írad ki a fovarosOrszaga() metódussal, hogy mely ország fővárosa "Budapest"
        // 1 pont
let fovarasosBudapest = fovarosOrszagok(1);
if (fovarasosBudapest=! null) {
    System.out.println("Magyarország");
    
}

        // Írad ki a fovarosOrszaga() metódussal, hogy mely ország fővárosa "Zagreb"
        // 1 pont
        let fovarasosZafreb = fovarosOrszagok(1);
        if (fovarasosBudapest=! null) {
            System.out.println("Hrvatska");
            
        }

        // Az ujFovarosOrszagPar() metódussal add hozzá a "Zagreb", "Hrvatska" párt a fővárosok országok párokhoz
        // 1 pont
        fovarosOrszagok.add(fovarosok("Zagreb").getOrszag("Hrvatska"));


        // A torolAdatPart() metódussal törld a "Ljubljana" főváros ország párt
        // 1 pont

clear.fovarosOrszagok(4);
        // A torolAdatPart() metódussal törld a "Prag" főváros ország párt
        // kezeld a felmerülő hibát és írd ki a hibát
        // 3 pont
clear.fovarosOrszagok(2);

        // Írasd ki a főváros, ország párokat!
        // 1 pont

    }

    /**
     * ujElemHozzaadasa() - egy elemet ad hozzá a megadott listához
     * @param list a lista, melyhez hozzá kell adni az elemet
     * @param elem az új elem
     */
    // 3 pont
let lista=new ArrayList<String>();
    lista.add("elem");

    /**
     * torolElemet() - a megadott listából törli a megadott elemet
     * @param list a lista, melyből törölni kell az elemet
     * @param elem a törlendő érték
     */
    // 3 pont
lista.clear("elem");

    /**
     * fovarosOrszaga() - a megadott főváros, ország párok és főváros adatokra visszaadja az osztágot és a fővárost,
     * vagy visszaadja, hogy az adott főváros nincs az adatai között.
     * @param countries a főváros ország párok
     * @param capital a főváros
     * @return "country fővárosa capital", ha a párok között szerepel a főváros, egyébként
     * capital nincs az adatok között.
     * Példa:
     * England fővárosa London.
     * London nincs az adatok között.
     */
    // 3 pont


    /**
     * ujFovarosOrszagPar() - A coutries-hoz hozzáadja a főváros ország (capital country) párt.
     * @param coutries a főváros ország párok
     * @param capital a főváros neve
     * @param country az ország neve
     */
    // 3 pont


    /**
     * A coutries főváros ország adatpárok közül törli a capital főváros ország adatpárt, ha szerepel benne.
     * Ha nem szerepel benne, akkor "Nincs " + capital + " főváros az adatok között" hibát dob.
     * @param coutries a főváros ország adatpárok
     * @param capital a főváros neve
     * @throws IllegalArgumentException
     */
    // 5 pont
let countries=countries("Budapest");
if(countries=! null) {  
    countries.remove("Budapest");

}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Orszag other = (Orszag) obj;
    if (country == null) {
        if (other.country != null)
            return false;
    } else if (!country.equals(other.country))
        return false;
    return true;    }
}
}