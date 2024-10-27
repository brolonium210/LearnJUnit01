import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Map;
import java.util.Random;

public class Start {
    GraphicsPanel gp;
    Player p;
    char[][][] desert;
    char[][][] local;

    Map<Character,Integer[]> playerD = Map.of(
    'a',new Integer[]{-1,0},
    'd',new Integer[]{1,0},
    's',new Integer[]{0,1},
    'w',new Integer[]{0,-1}
    );

    public Start(int width, int height,Player p) {
        this.p = p;
        this.gp = new GraphicsPanel(width/2, height);
    }
    //def need to practice this little trick
    //this kinda didnt work but could be useful anyway
    public void setGp() {
        this.gp.setLocal(local);
    }


    public JFrame setupFrame(int width, int height) {
        JFrame frame = new JFrame();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setLocation(20,20);
        frame.add(gp);
        frame.setFocusable(true);
        frame.setVisible(true);
        //this bit will need a few more reps as well
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                assert true;
            }

            @Override
            public void keyPressed(KeyEvent e) {
                assert true;
            }

            @Override
            public void keyReleased(KeyEvent e) {
                Integer[] actualDir = playerD.get(e.getKeyChar());
                setPlayerLoc(actualDir[0],actualDir[1]);
            }
        });

        return frame;
    }

    public void makeDesert(int x,int y,Player p){
        char[][][] desert = new char[x][y][2];
        Random random = new Random();
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                char ch;
                if(random.nextInt(100)>98){
                    ch = 't';
                }else {
                    ch = (char) (98 + random.nextInt(4));
                }
                char curr = ch;
                char prev = ch;
                desert[i][j][0] = curr;
                desert[i][j][1] = prev;
            }
        }
        this.desert = desert;
    }

    public void setPlayerLoc(int x,int y){
        int temp1 = p.getX();
        int temp2 = p.getY();
        if((temp1+x >= desert[0].length-8)||(temp1+x <= 8)){
            p.setX(temp1);
            p.setY(temp2);
        }else if((temp2+y >= desert.length-8)||(temp2+y <= 8)){
            p.setX(temp1);
            p.setY(temp2);
        }else {
            p.setX(temp1 + x);
            p.setY(temp2 + y);
            desert[temp1][temp2][0] = desert[temp1][temp2][1];
            desert[p.getX()][p.getY()][0] = 'p';
        }
    }

    public void repaintFrame(){
        gp.repaint();
    }

    public void makeLocal(char[][][] desert,Player p){
        char[][][] local = new char[15][15][2];
        int topLeftX = p.getX()-7;
        int topLeftY = p.getY()-7;

        for(int i=0;i<(15);i++){
            for(int j=0;j<(15);j++){
                local[i][j][0] = desert[topLeftX+i][topLeftY+j][0];
            }
        }
//        local[topLeftX][topLeftY][0] = 'p';
        this.local = local;
        setGp();
    }
}

