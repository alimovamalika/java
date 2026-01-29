public class PolymorphismDemo {
    public static void main(String[] args) {

        // Создаём ссылку базового класса на объект производного класса
        Person person = new Student("Иван", 19, "ИС-21");

        // Вызов переопределённого метода
        person.displayInfo();

        System.out.println();

        // Создаём обычного Person для сравнения
        Person anotherPerson = new Person("Мария", 25);
        anotherPerson.displayInfo();
    }
}

// Базовый класс
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод, который будет переопределяться
    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}

// Производный класс
class Student extends Person {
    String group;

    public Student(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }

    // Переопределяем метод displayInfo
    @Override
    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Группа: " + group);
    }
}
