import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        double[] D = new double[17];
        Random rand = new Random();

        for (int i = 0; i < D.length; i++) D[i] = rand.nextDouble() * 20 - 10;

        double sum = 0;
        for (double x : D) sum += x;

        System.out.println("Среднее арифметическое: " + (sum / D.length));
    }
}