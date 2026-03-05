import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int[] A = new int[15];
        Random rand = new Random();

        for (int i = 0; i < 15; i++) A[i] = rand.nextInt(201) - 100;

        int count = 0;
        for (int x : A) if (x < 0) count++;

        System.out.println("Количество отрицательных элементов: " + count);
    }
}