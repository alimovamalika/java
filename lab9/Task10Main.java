// Переименовали базовый класс, чтобы не было конфликтов с другими заданиями
class ProductTask10 {
    String name;
    double price;

    ProductTask10(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showPrice() {
        System.out.println(name + " price: $" + price);
    }
}

class Food extends ProductTask10 {
    Food(String name, double price) {
        super(name, price);
    }

    @Override
    void showPrice() {
        System.out.println("Food item: " + name + ", price: $" + price);
    }
}

class Electronics extends ProductTask10 {
    Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    void showPrice() {
        System.out.println("Electronics item: " + name + ", price: $" + price);
    }
}

class Clothes extends ProductTask10 {
    Clothes(String name, double price) {
        super(name, price);
    }

    @Override
    void showPrice() {
        System.out.println("Clothing item: " + name + ", price: $" + price);
    }
}

public class Task10Main {
    public static void main(String[] args) {
        ProductTask10 apple = new Food("Apple", 1.2);
        ProductTask10 laptop = new Electronics("Laptop", 1200);
        ProductTask10 tshirt = new Clothes("T-Shirt", 25);

        apple.showPrice();
        laptop.showPrice();
        tshirt.showPrice();
    }
}