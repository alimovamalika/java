import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[] A = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) A[i] = rand.nextInt(101);

        int max = A[0];
        for (int x : A) if (x > max) max = x;

        System.out.println("Наибольший элемент массива: " + max);
    }
}