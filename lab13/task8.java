import java.util.*;

public class task8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Programming", "Code");

        list.stream()
            .filter(s -> s.length() > 5)
            .forEach(System.out::println);
    }
}