import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String noSpaces = text.replace(" ", "");
        System.out.println(noSpaces.length());
    }
}