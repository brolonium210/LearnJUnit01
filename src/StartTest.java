import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;
class StartTest {
    Player p = new Player("player",10,10);
    Start start = new Start(150,150,p);
    @Test
    void setupFrame() {
        JFrame frame = start.setupFrame(500,500);
        Assertions.assertNotNull(frame);
        Assertions.assertEquals(frame.getWidth(), 500);
        Assertions.assertEquals(frame.getHeight(), 500);
        Assertions.assertEquals(20, frame.getX());
        Assertions.assertEquals(20, frame.getY());
    }
    @Test
    void test_desert(){
        start.makeDesert(25,25,p);
        Assertions.assertEquals(start.desert.length, 25);
        Assertions.assertEquals(start.desert[0].length, 25);
        Assertions.assertEquals(start.desert[0][0].length, 2);
        for(int i =0;i<start.desert.length;i++){
            for(int j =0;j<start.desert[i].length;j++){
                System.out.print(start.desert[i][j][0]+" ");
            }
            System.out.println();
        }
        System.out.println();

//        Assertions.assertEquals(myArr[0][0][0],'b');
    }

    @Test
    void test_local(){
        start.makeDesert(25,25,p);
        start.makeLocal(start.desert,p);
        Assertions.assertEquals(start.local.length, 15);
        for(int i =0;i<start.local.length;i++){
            for(int j =0;j<start.local[i].length;j++){
                System.out.print(start.local[i][j][0]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}