// Переименовали базовый класс, чтобы не конфликтовать с другими заданиями
class AnimalTask7 {
    String name;

    AnimalTask7(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " makes some sound.");
    }
}

class Lion extends AnimalTask7 {
    Lion(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " roars: Roar!");
    }
}

class Elephant extends AnimalTask7 {
    Elephant(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " trumpets: Pawoo!");
    }
}

class Monkey extends AnimalTask7 {
    Monkey(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " chatters: Ooh Ooh Ah Ah!");
    }
}

public class Task7Main {
    public static void main(String[] args) {
        AnimalTask7 lion = new Lion("Simba");
        AnimalTask7 elephant = new Elephant("Dumbo");
        AnimalTask7 monkey = new Monkey("George");

        lion.makeSound();
        elephant.makeSound();
        monkey.makeSound();
    }
}