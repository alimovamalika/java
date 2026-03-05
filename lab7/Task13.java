import java.util.Arrays;
import java.util.Collections;

public class Task13 {
    public static void main(String[] args) {
        Integer[] B = new Integer[10];
        for (int i = 0; i < 10; i++) B[i] = (int)(Math.random()*101);

        Arrays.sort(B, Collections.reverseOrder());

        System.out.println("Массив по убыванию: " + Arrays.toString(B));
    }
}