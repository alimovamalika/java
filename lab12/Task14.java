import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String start = scanner.nextLine();

        System.out.println(text.startsWith(start));
    }
}