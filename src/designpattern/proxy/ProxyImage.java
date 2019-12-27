package designpattern.proxy;

public class ProxyImage implements Image {

    private String url;
    private Image image;

    public ProxyImage(String url) {
        this.url = url;
        System.out.println("Image unloaded");
    }

    @Override
    public void showImage() {
        if (image == null)
            image = new RealImage(url);
        image.showImage();
    }
}
