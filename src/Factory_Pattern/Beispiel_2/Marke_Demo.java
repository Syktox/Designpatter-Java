package Factory_Pattern.Beispiel_2;

public class Marke_Demo {
    public static void main(String[] args) {
        Marke marke = MarkenFactory.show("Audi");
        if (marke != null)  marke.showMarke();
    }
}
