package designpattern.templatemethod;

public class Football extends Game {
    @Override
    public void init() {
        System.out.println("Init football game");
    }

    @Override
    public void start() {
        System.out.println("Start football game");
    }

    @Override
    public void stop() {
        System.out.println("Stop football game");
    }
}
