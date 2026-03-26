import javax.swing.*;
import java.awt.*;

public class Task1 extends JFrame {

    public Task1() {
        setTitle("Task 1");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Прямоугольник
        g.drawRect(50, 80, 100, 50);
        g.drawString("Rectangle", 50, 70);

        // Круг
        g.drawOval(180, 80, 50, 50);
        g.drawString("Circle", 180, 70);

        // Линия
        g.drawLine(50, 180, 200, 180);
        g.drawString("Line", 50, 170);
    }

    public static void main(String[] args) {
        new Task1();
    }
}