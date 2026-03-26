import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task9 extends JFrame {

    private int x = 0;              // координата X шара
    private int y = 150;            // координата Y шара
    private int diameter = 40;      // диаметр шара

    public Task9() {
        setTitle("Task 9 - Анимация");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        // Таймер для анимации (каждые 50 мс)
        Timer timer = new Timer(50, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                x += 5; // движение вправо
                if (x > getWidth()) { // если шар вышел за правую границу
                    x = -diameter;   // возвращаем влево
                }
                repaint(); // перерисовать окно
            }
        });
        timer.start();
    }

    // Метод рисования
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.RED);
        g.fillOval(x, y, diameter, diameter);
    }

    public static void main(String[] args) {
        new Task9();
    }
}