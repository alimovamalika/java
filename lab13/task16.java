import java.util.*;
import java.util.stream.Collectors;

class Student16 {
    String name;
    int age;

    Student16(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class task16 {
    public static void main(String[] args) {
        List<Student16> list = Arrays.asList(
            new Student16("A", 20),
            new Student16("B", 20),
            new Student16("C", 21)
        );

        Map<Integer, List<Student16>> grouped =
            list.stream().collect(Collectors.groupingBy(s -> s.age));

        System.out.println(grouped);
    }
}