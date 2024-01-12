package Factory_Pattern.Example_1;

public class WindowFactory {
    public static Window createWindow(String window) {
        if (window.equals("mac")) {
            return new MacWindow();
        } else if (window.equals("windows")) {
            return new WinWindow();
        }
        return null;
    }
}
