// Переименовали базовый класс, чтобы не было конфликтов с другими заданиями
class ApplianceTask15 {
    String brand;

    ApplianceTask15(String brand) {
        this.brand = brand;
    }

    void operate() {
        System.out.println(brand + " appliance is operating.");
    }
}

class Refrigerator extends ApplianceTask15 {
    Refrigerator(String brand) {
        super(brand);
    }

    @Override
    void operate() {
        System.out.println(brand + " refrigerator is cooling food.");
    }
}

class WashingMachine extends ApplianceTask15 {
    WashingMachine(String brand) {
        super(brand);
    }

    @Override
    void operate() {
        System.out.println(brand + " washing machine is washing clothes.");
    }
}

class Microwave extends ApplianceTask15 {
    Microwave(String brand) {
        super(brand);
    }

    @Override
    void operate() {
        System.out.println(brand + " microwave is heating food.");
    }
}

public class Task15Main {
    public static void main(String[] args) {
        ApplianceTask15 fridge = new Refrigerator("LG");
        ApplianceTask15 washer = new WashingMachine("Samsung");
        ApplianceTask15 microwave = new Microwave("Panasonic");

        fridge.operate();
        washer.operate();
        microwave.operate();
    }
}