// Переименовали базовый класс, чтобы не конфликтовать с другими заданиями
class GameCharacterTask14 {
    String name;

    GameCharacterTask14(String name) {
        this.name = name;
    }

    void attack() {
        System.out.println(name + " attacks!");
    }
}

class Warrior extends GameCharacterTask14 {
    Warrior(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " swings a sword!");
    }
}

class Mage extends GameCharacterTask14 {
    Mage(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " casts a fireball!");
    }
}

class Archer extends GameCharacterTask14 {
    Archer(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " shoots an arrow!");
    }
}

public class Task14Main {
    public static void main(String[] args) {
        GameCharacterTask14 warrior = new Warrior("Conan");
        GameCharacterTask14 mage = new Mage("Gandalf");
        GameCharacterTask14 archer = new Archer("Legolas");

        warrior.attack();
        mage.attack();
        archer.attack();
    }
}