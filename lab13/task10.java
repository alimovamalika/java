import java.util.*;

public class task10 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        int min = list.stream()
                      .min(Integer::compare)
                      .orElse(0);

        System.out.println(min);
    }
}