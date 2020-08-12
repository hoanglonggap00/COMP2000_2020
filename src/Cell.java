import java.awt.*;
import javax.swing.*;

public class Cell {

    int x;
    int y;
    static int size = 35;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void paint(Graphics g,Point mousePos) {
        if (mousePos.getX() >= x && mousePos.getX() <= x+size) {
            if (mousePos.getY() >= y && mousePos.getY() <= y+size) {
                g.setColor(Color.GRAY);
                g.fillRect(x, y, size, size);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, size, size);
            }
        } else {
            g.setColor(Color.WHITE);
            g.fillRect(x, y, size, size);
            g.setColor(Color.BLACK);
            g.drawRect(x, y, size, size);
        }
    }

    void fillGrey(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(x, y, 35, 35);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 35, 35);
    }
}