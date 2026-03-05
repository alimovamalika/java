import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] B = new int[15];
        Random rand = new Random();

        for (int i = 0; i < B.length; i++) B[i] = rand.nextInt(201) - 100;

        int sumPos = 0;
        for (int x : B) if (x > 0) sumPos += x;

        System.out.println("Сумма положительных элементов: " + sumPos);
    }
}