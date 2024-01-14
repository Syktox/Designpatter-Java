package Proxy_Pattern.Example_3;

import java.util.ArrayList;
import java.util.List;

interface Internet {
    void connectTo(String url);
}
class RealInternet implements Internet {
    @Override
    public void connectTo(String url) {
        System.out.println("Connection to: " + url);
    }
}
class SaferInternetProxy implements Internet {
    private final Internet net;
    private static final List<String> blockList = new ArrayList<>();
    static {
        blockList.add("www.loidl.at");
        blockList.add("www.forbidden.com");
    }
    SaferInternetProxy(Internet net) {
        this.net = net;
    }
    @Override
    public void connectTo(String url) {
        if (blockList.contains(url)) {
            throw new IllegalStateException(url + " is blocked!");
        }
        net.connectTo(url);
    }
}
class TestInternet {
    public static void main(String[] args) {
        Internet net = new RealInternet();
        externalCode(new SaferInternetProxy(net));
    }
    private static void externalCode(Internet net) {
        net.connectTo("www.loidl.at");
    }
}