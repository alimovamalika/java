class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
    }
}

class Student extends Person {
    Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    void study() {
        System.out.println(firstName + " is studying.");
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String firstName, String lastName, String subject) {
        super(firstName, lastName);
        this.subject = subject;
    }

    void teach() {
        System.out.println(firstName + " is teaching " + subject);
    }
}

class Administrator extends Person {
    Administrator(String firstName, String lastName) {
        super(firstName, lastName);
    }

    void manage() {
        System.out.println(firstName + " is managing the school.");
    }
}

public class Task5Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", "Johnson");
        Teacher teacher = new Teacher("Mr. Smith", "Brown", "Math");
        Administrator admin = new Administrator("Mrs. Clark", "White");

        student.displayInfo();
        student.study();

        teacher.displayInfo();
        teacher.teach();

        admin.displayInfo();
        admin.manage();
    }
}