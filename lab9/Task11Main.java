// Переименовали базовый класс, чтобы не было конфликтов с другими заданиями
class TeamMemberTask11 {
    String name;

    TeamMemberTask11(String name) {
        this.name = name;
    }
}

class Player extends TeamMemberTask11 {
    Player(String name) {
        super(name);
    }

    void play() {
        System.out.println(name + " is playing in the game.");
    }
}

class Coach extends TeamMemberTask11 {
    Coach(String name) {
        super(name);
    }

    void train() {
        System.out.println(name + " is training the team.");
    }
}

class Doctor extends TeamMemberTask11 {
    Doctor(String name) {
        super(name);
    }

    void heal() {
        System.out.println(name + " is healing the players.");
    }
}

public class Task11Main {
    public static void main(String[] args) {
        Player player = new Player("Alex");
        Coach coach = new Coach("Mr. Johnson");
        Doctor doctor = new Doctor("Dr. Smith");

        player.play();
        coach.train();
        doctor.heal();
    }
}