import java.util.Random;
import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        int[] A = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) A[i] = rand.nextInt(201) - 100;

        for (int i = 0; i < 10; i++) if (A[i] < 0) A[i] = 0;

        System.out.println("Массив после замены отрицательных на 0: " + Arrays.toString(A));
    }
}