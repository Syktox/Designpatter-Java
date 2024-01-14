package Proxy_Pattern.Example_2;

public class Webserver implements  WebserverDisplay{
    String name;

    Webserver(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
    }
}
