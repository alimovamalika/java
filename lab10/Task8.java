import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task8 extends JFrame implements ActionListener {

    JTextField num1Field, num2Field;
    JButton addButton;
    JLabel resultLabel;

    public Task8() {
        setTitle("Task 8 - Калькулятор");
        setSize(300, 200);
        setLayout(new FlowLayout());

        num1Field = new JTextField(5);
        num2Field = new JTextField(5);
        addButton = new JButton("Сложить");
        resultLabel = new JLabel("Результат: ");

        add(new JLabel("Число 1:"));
        add(num1Field);
        add(new JLabel("Число 2:"));
        add(num2Field);
        add(addButton);
        add(resultLabel);

        addButton.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int sum = num1 + num2;
            resultLabel.setText("Результат: " + sum);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Введите числа!");
        }
    }

    public static void main(String[] args) {
        new Task8();
    }
}