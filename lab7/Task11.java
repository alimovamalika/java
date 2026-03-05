import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        int[] B = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) B[i] = rand.nextInt(101);

        int min = B[0];
        for (int x : B) if (x < min) min = x;

        System.out.println("Наименьший элемент массива: " + min);
    }
}