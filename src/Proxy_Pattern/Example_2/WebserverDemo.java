package Proxy_Pattern.Example_2;

public class WebserverDemo {
    public static void main(String[] args) {
        Webserver ws = new Webserver("youtube");
        ProxyWebserver pws = new ProxyWebserver(ws);
        pws.display();
    }
}
