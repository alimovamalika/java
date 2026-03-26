import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task10 extends JFrame implements ItemListener {

    Checkbox redBox, greenBox, blueBox;
    Color currentColor = Color.BLACK;

    public Task10() {
        setTitle("Task 10 - Checkbox Цвета");
        setSize(400, 400);
        setLayout(new FlowLayout());

        // Создаем checkboxes
        redBox = new Checkbox("Красный");
        greenBox = new Checkbox("Зелёный");
        blueBox = new Checkbox("Синий");

        // Добавляем слушателей
        redBox.addItemListener(this);
        greenBox.addItemListener(this);
        blueBox.addItemListener(this);

        // Добавляем на окно
        add(redBox);
        add(greenBox);
        add(blueBox);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        int r = redBox.getState() ? 255 : 0;
        int g = greenBox.getState() ? 255 : 0;
        int b = blueBox.getState() ? 255 : 0;

        currentColor = new Color(r, g, b);
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(currentColor);
        g.fillOval(150, 150, 100, 100);
    }

    public static void main(String[] args) {
        new Task10();
    }
}