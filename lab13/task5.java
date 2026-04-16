import java.util.*;

public class task5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,10,3,8);

        int max = list.stream()
                      .max(Integer::compare)
                      .orElse(0);

        System.out.println(max);
    }
}