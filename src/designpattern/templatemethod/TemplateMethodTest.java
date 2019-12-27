package designpattern.templatemethod;

public class TemplateMethodTest {
    public static void main(String[] args) {
        Game footballGame = new Football();
        footballGame.play();

        Game cricketGame = new CricketGame();
        cricketGame.play();
    }
}
