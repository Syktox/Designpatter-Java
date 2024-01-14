package Factory_Pattern.Example_1;

public class WindowFactory extends FactoryWindow {
    public Window createWindow(String window) {
        if (window.equals("mac")) {
            return new MacWindow();
        } else if (window.equals("windows")) {
            return new WinWindow();
        }
        return null;
    }
}
