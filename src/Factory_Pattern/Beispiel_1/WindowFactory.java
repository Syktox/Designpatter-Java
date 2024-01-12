package Factory_Pattern.Beispiel_1;

import Factory_Pattern.Beispiel_1.MacWindow;
import Factory_Pattern.Beispiel_1.WinWindow;
import Factory_Pattern.Beispiel_1.Window;

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
