class Device {
    String brand;
    int power; // в ваттах

    Device(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    void turnOn() {
        System.out.println(brand + " device is turning on.");
    }
}

class Laptop extends Device {
    Laptop(String brand, int power) {
        super(brand, power);
    }

    @Override
    void turnOn() {
        System.out.println(brand + " laptop is booting up with power " + power + "W.");
    }
}

class Smartphone extends Device {
    Smartphone(String brand, int power) {
        super(brand, power);
    }

    @Override
    void turnOn() {
        System.out.println(brand + " smartphone is turning on with power " + power + "W.");
    }
}

class Tablet extends Device {
    Tablet(String brand, int power) {
        super(brand, power);
    }

    @Override
    void turnOn() {
        System.out.println(brand + " tablet is powering up with " + power + "W.");
    }
}

public class Task6Main {
    public static void main(String[] args) {
        Device laptop = new Laptop("Dell", 65);
        Device smartphone = new Smartphone("Samsung", 15);
        Device tablet = new Tablet("Apple", 20);

        laptop.turnOn();
        smartphone.turnOn();
        tablet.turnOn();
    }
}