import java.util.function.Consumer;

public class task11 {
    public static void main(String[] args) {
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("Hello");
    }
}