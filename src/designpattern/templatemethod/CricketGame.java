package designpattern.templatemethod;

public class CricketGame extends Game {

    @Override
    public void init() {
        System.out.println("Init cricket game");
    }

    @Override
    public void start() {
        System.out.println("Start cricket game");
    }

    @Override
    public void stop() {
        System.out.println("Stop cricket game");
    }
}
