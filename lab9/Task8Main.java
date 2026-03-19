// Переименовали базовый класс, чтобы не было конфликтов с другими заданиями
class VehicleTask8 {
    String name;

    VehicleTask8(String name) {
        this.name = name;
    }

    void startEngine() {
        System.out.println(name + " engine is starting.");
    }
}

class Bike extends VehicleTask8 {
    Bike(String name) {
        super(name);
    }

    @Override
    void startEngine() {
        System.out.println(name + " bike engine is started with a kick.");
    }
}

class Bus extends VehicleTask8 {
    Bus(String name) {
        super(name);
    }

    @Override
    void startEngine() {
        System.out.println(name + " bus engine is started with ignition key.");
    }
}

class Taxi extends VehicleTask8 {
    Taxi(String name) {
        super(name);
    }

    @Override
    void startEngine() {
        System.out.println(name + " taxi engine is started with a button.");
    }
}

public class Task8Main {
    public static void main(String[] args) {
        VehicleTask8 bike = new Bike("MountainBike");
        VehicleTask8 bus = new Bus("CityBus");
        VehicleTask8 taxi = new Taxi("YellowTaxi");

        bike.startEngine();
        bus.startEngine();
        taxi.startEngine();
    }
}