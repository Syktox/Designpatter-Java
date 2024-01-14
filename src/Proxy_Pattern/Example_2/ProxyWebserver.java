package Proxy_Pattern.Example_2;

public class ProxyWebserver implements WebserverDisplay {
    Webserver webserver;
    ProxyWebserver(Webserver webserver) {
        this.webserver = webserver;
    }


    @Override
    public void display() {
        if (webserver.name.equals("youtube")) {
            System.out.println("Blocked Website\nConnection DENIED");
        } else {
            webserver.display();
        }
    }
}
