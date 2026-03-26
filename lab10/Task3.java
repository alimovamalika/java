import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task3 extends JFrame implements ActionListener {

    JTextField textField;
    JButton button;
    JLabel label;

    public Task3() {
        setTitle("Task 3 - TextField");
        setSize(300, 200);
        setLayout(new FlowLayout());

        textField = new JTextField(15);
        button = new JButton("OK");
        label = new JLabel("");

        add(new JLabel("Введите имя:"));
        add(textField);
        add(button);
        add(label);

        button.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = textField.getText();
        label.setText("Сәлем, " + name);
    }

    public static void main(String[] args) {
        new Task3();
    }
}