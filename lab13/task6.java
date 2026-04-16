import java.util.*;

public class task6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Hi", "Programming");

        list.stream()
            .sorted(Comparator.comparing(String::length))
            .forEach(System.out::println);
    }
}