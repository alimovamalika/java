import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int[][] M = new int[5][5];
        Random rand = new Random();

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                M[i][j] = rand.nextInt(11);

        int sum = 0;
        for (int i = 0; i < 5; i++) sum += M[i][4-i];

        System.out.println("Сумма элементов побочной диагонали: " + sum);
    }
}