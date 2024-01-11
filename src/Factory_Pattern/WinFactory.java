package Factory_Pattern;

public class WinFactory extends FactoryWindow{

    @Override
    Window createWindow() {
        return new WinWindow();
    }
}
