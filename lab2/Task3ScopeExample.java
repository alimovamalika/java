public class Task3ScopeExample {

    int classField = 5; // поле класса

    public void showValues() {
        int localVariable = 10; // локальная переменная

        System.out.println("Поле класса: " + classField);
        System.out.println("Локальная переменная: " + localVariable);
    }

    public static void main(String[] args) {
        Task3ScopeExample example = new Task3ScopeExample();
        example.showValues();
    }
}
