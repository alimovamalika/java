import java.util.*;
import java.util.function.Predicate;

public class task3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Predicate<Integer> isOdd = x -> x % 2 != 0;

        list.stream()
            .filter(isOdd)
            .forEach(System.out::println);
    }
}