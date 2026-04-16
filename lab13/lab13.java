import java.util.*;

class Order {
    int amount;

    Order(int amount) {
        this.amount = amount;
    }
}

public class task20 {
    public static void main(String[] args) {
        List<Order> list = Arrays.asList(
            new Order(500),
            new Order(1500),
            new Order(2000)
        );

        list.stream()
            .filter(o -> o.amount > 1000)
            .sorted(Comparator.comparing(o -> o.amount))
            .forEach(o -> System.out.println(o.amount));
    }
}