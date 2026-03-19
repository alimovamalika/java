// Переименовали базовый класс, чтобы не было конфликтов с другими заданиями
class InstrumentTask12 {
    String name;

    InstrumentTask12(String name) {
        this.name = name;
    }

    void playSound() {
        System.out.println(name + " is making a sound.");
    }
}

class Guitar extends InstrumentTask12 {
    Guitar(String name) {
        super(name);
    }

    @Override
    void playSound() {
        System.out.println(name + " strums chords: Strum Strum!");
    }
}

class Piano extends InstrumentTask12 {
    Piano(String name) {
        super(name);
    }

    @Override
    void playSound() {
        System.out.println(name + " plays melodies: Ding Ding!");
    }
}

class Drums extends InstrumentTask12 {
    Drums(String name) {
        super(name);
    }

    @Override
    void playSound() {
        System.out.println(name + " beats rhythm: Boom Boom!");
    }
}

public class Task12Main {
    public static void main(String[] args) {
        InstrumentTask12 guitar = new Guitar("Fender Guitar");
        InstrumentTask12 piano = new Piano("Yamaha Piano");
        InstrumentTask12 drums = new Drums("Pearl Drums");

        guitar.playSound();
        piano.playSound();
        drums.playSound();
    }
}