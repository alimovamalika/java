import java.util.Random;
import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        int[] B = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) B[i] = rand.nextInt(201) - 100;

        for (int i = 0; i < 10; i++) if (B[i] > 0) B[i] = 0;

        System.out.println("Массив после замены положительных на 0: " + Arrays.toString(B));
    }
}