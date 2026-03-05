import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] A = new int[20];
        Random rand = new Random();

        // Заполнение массива случайными числами от -100 до 100
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(201) - 100; 
        }

        int sumNeg = 0;
        for (int i : A) {
            if (i < 0) sumNeg += i;
        }

        System.out.println("Массив A: ");
        for (int i : A) System.out.print(i + " ");
        System.out.println("\nСумма отрицательных элементов: " + sumNeg);
    }
}