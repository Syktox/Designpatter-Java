package Factory_Pattern.Beispiel_2;

public class MarkenFactory {
    public static Marke show(String marke) {
        if (marke.equals("BMW")) return new BMW();
        if (marke.equals("Mercedes")) return new Mercedes();
        if (marke.equals("Audi")) return new Audi();
        return null;
    }
}
