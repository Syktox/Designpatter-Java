package Proxy_Pattern.Example_1;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        loadImageFromDisk();
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying: " + filename);
    }

    void loadImageFromDisk() {
        System.out.println("Loading...");
    }
}
