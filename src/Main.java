import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    Grid grid;

    public class App extends JPanel {
        public App() {
            setPreferredSize(new Dimension(720,720));
            grid = new Grid();
        }

        @Override
        public void paint(Graphics g) {
            grid.paint(g, getMousePosition());
        }
    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
    }

    public Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App Canvas = new App();
        this.setContentPane(Canvas);
        this.pack();
        this.setVisible(true);

    }

}