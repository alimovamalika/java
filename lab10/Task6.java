import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task6 extends JFrame implements MouseListener {

    int x = 0;
    int y = 0;

    public Task6() {
        setTitle("Task 6 - Мышь");
        setSize(400, 400);

        addMouseListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);

        // рисуем точку
        g.fillOval(x, y, 6, 6);

        // вывод координат
        g.drawString("X: " + x + " Y: " + y, 20, 50);
    }

    // обязательные методы (пустые)
    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new Task6();
    }
}