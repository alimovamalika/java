import java.util.*;

public class task15 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.stream()
            .filter(x -> x > 2)
            .map(x -> x * 2)
            .sorted()
            .forEach(System.out::println);
    }
}