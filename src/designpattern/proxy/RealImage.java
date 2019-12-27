package designpattern.proxy;

public class RealImage implements Image {

    private String url;

    public RealImage(String url) {
        this.url = url;
        System.out.println("Image loaded");
    }

    @Override
    public void showImage() {
        System.out.println("Show image");
    }
}
