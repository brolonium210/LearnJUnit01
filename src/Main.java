import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Player p = new Player("player1",20,20);

        Start start = new Start(800,800,p);
        start.makeDesert(150,150,p);
        start.makeLocal(start.desert,p);
        start.setupFrame(1000, 800);
        start.setPlayerLoc(0,0);
        while(true){
            start.makeLocal(start.desert,p);
            Thread.sleep(1000);
            start.repaintFrame();
        }

    }
}