import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int[][] M = new int[5][5];
        Random rand = new Random();

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                M[i][j] = rand.nextInt(11);

        int prod = 1;
        for (int i = 0; i < 5; i++) prod *= M[i][i];

        System.out.println("Произведение элементов главной диагонали: " + prod);
    }
}