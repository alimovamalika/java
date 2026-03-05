import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[][] A = new int[10][10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                A[i][j] = rand.nextInt(21) - 10;

        for (int i = 0; i < 10; i++) {
            int sumNeg = 0;
            for (int j = 0; j < 10; j++) if (A[i][j] < 0) sumNeg += A[i][j];
            System.out.println("Сумма отрицательных элементов строки " + (i+1) + ": " + sumNeg);
        }
    }
}