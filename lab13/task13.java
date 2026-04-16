import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class task13 {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
            new Person("A", 25),
            new Person("B", 20)
        );

        list.stream()
            .sorted(Comparator.comparing(p -> p.age))
            .forEach(p -> System.out.println(p.name));
    }
}