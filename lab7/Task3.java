import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        double[] A = new double[12];
        Random rand = new Random();

        for (int i = 0; i < A.length; i++) A[i] = rand.nextDouble() * 20 - 10;

        double prodNeg = 1;
        boolean hasNeg = false;
        for (double x : A) {
            if (x < 0) { prodNeg *= x; hasNeg = true; }
        }
        if (!hasNeg) prodNeg = 0;

        System.out.println("Произведение отрицательных элементов: " + prodNeg);
    }
}