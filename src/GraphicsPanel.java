import javax.swing.JPanel;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class GraphicsPanel extends JPanel {
    private char[][][] local;
    private Map<Character,Color> colors = Map.of(
     'p',new Color(0x000000),
     'a',new Color(0x474350),
     'b',new Color(250,250,200 ),
     'c',new Color(250,250,205),
     'd',new Color(250,250,210),
     'e',new Color(250,250,215),
     't',new Color(30, 100, 30)
    );

    public GraphicsPanel(int width, int height) {
        setPreferredSize(new Dimension(width, height));
        }

    public void setLocal(char[][][] local) {
        this.local = local;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for(int i = 0;i<local.length;i++){
            for(int j = 0;j<local.length;j++){
                int currX = i*50;
                int currY = j*50;

                //def need to practice using MAPS way more
                Color color = colors.getOrDefault(local[i][j][0], Color.WHITE);
                g2d.setColor(color);
                g2d.fillRect(currX, currY, 50, 50);
            }
        }
    }
}

