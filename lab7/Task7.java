import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int[][] B = new int[8][8];
        Random rand = new Random();

        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                B[i][j] = rand.nextInt(21) - 10;

        for (int j = 0; j < 8; j++) {
            int sumPos = 0;
            for (int i = 0; i < 8; i++) if (B[i][j] > 0) sumPos += B[i][j];
            System.out.println("Сумма положительных элементов столбца " + (j+1) + ": " + sumPos);
        }
    }
}