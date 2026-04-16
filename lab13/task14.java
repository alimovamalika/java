import java.util.*;

class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

public class task14 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student("Ali", 20, 85),
            new Student("Bob", 22, 70)
        );

        list.stream()
            .filter(s -> s.grade > 80)
            .sorted(Comparator.comparing(s -> s.name))
            .forEach(s -> System.out.println(s.name));
    }
}