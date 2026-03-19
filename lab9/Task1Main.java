class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displaySpeed() {
        System.out.println(brand + " speed: " + speed + " km/h");
    }

    void fuelConsumption() {
        System.out.println("Fuel consumption not defined");
    }
}

class Sedan extends Car {

    Sedan(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void fuelConsumption() {
        System.out.println("Sedan fuel consumption: 7 L/100km");
    }
}

class Truck extends Car {

    Truck(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void fuelConsumption() {
        System.out.println("Truck fuel consumption: 20 L/100km");
    }
}

class SUV extends Car {

    SUV(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void fuelConsumption() {
        System.out.println("SUV fuel consumption: 10 L/100km");
    }
}

public class Task1Main {
    public static void main(String[] args) {

        Car sedan = new Sedan("Toyota", 180);
        Car truck = new Truck("Volvo", 120);
        Car suv = new SUV("BMW", 160);

        sedan.displaySpeed();
        sedan.fuelConsumption();

        truck.displaySpeed();
        truck.fuelConsumption();

        suv.displaySpeed();
        suv.fuelConsumption();
    }
}