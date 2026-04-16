import java.util.*;

public class task17 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        int sum = list.stream()
                      .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}