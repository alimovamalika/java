import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        double[] C = new double[25];
        Random rand = new Random();

        for (int i = 0; i < C.length; i++) C[i] = rand.nextDouble() * 20 - 10;

        double prodPos = 1;
        boolean hasPos = false;
        for (double x : C) {
            if (x > 0) { prodPos *= x; hasPos = true; }
        }
        if (!hasPos) prodPos = 0;

        System.out.println("Произведение положительных элементов: " + prodPos);
    }
}