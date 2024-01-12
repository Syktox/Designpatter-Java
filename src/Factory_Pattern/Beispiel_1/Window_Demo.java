package Factory_Pattern.Beispiel_1;

import java.util.Scanner;

public class Window_Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gib mac oder windows ein!");
        String value = scan.next();
        Window window = WindowFactory.createWindow(value);
        if (window != null) {
            window.openWindow();
        }
    }
}

