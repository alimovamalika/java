import java.util.Arrays;
import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        int[] A = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) A[i] = rand.nextInt(101);

        Arrays.sort(A);

        System.out.println("Отсортированный массив: " + Arrays.toString(A));
    }
}