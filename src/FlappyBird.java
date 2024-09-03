import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

public class FlappyBird extends JPanel {
    int width = 360;
    int height = 640;

    //Images for background
    Image backgroundImg;
    Image birdImg;
    Image toppipeImg;
    Image bottompipeImg;

    FlappyBird() {
        setPreferredSize(new Dimension(boardWith, boardHeight));
       // setBackground(Color.blue);

        //Load Images
        backgroundImg = new ImageIcon(getClass().getResource("./flappbirgdbg.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource(./flappybird.png)).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        //background
        g.drawImage(backgroundImg, 0, 0, boardWidth, boardHeight, null);
    }
}
