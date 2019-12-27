package designpattern.templatemethod;

public abstract class Game {
    public abstract void init();

    public abstract void start();

    public abstract void stop();

    public void play() {
        init();
        start();
        stop();
    }
}
