import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boarrdHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        //frame.setVisible(true);
        frame.setSize(boardWidth, boarrdHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        frame.setVisible(true);
    }
}
