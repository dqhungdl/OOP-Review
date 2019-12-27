package designpattern.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("ABC.png");
        proxyImage.showImage();
        proxyImage.showImage();
    }
}
