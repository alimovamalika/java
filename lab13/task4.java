import java.util.*;

public class task4 {
    public class task4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        list.stream()
            .map(x -> x * x)
            .forEach(System.out::println);
    }
}