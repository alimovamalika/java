import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        int[] B = new int[15];
        Random rand = new Random();

        for (int i = 0; i < 15; i++) B[i] = rand.nextInt(201) - 100;

        int count = 0;
        for (int x : B) if (x > 0) count++;

        System.out.println("Количество положительных элементов: " + count);
    }
}