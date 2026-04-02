import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        ArrayList<String> history = new ArrayList<>();

        history.add("2 + 2 = 4");
        history.add("3 * 3 = 9");

        for (String h : history) {
            System.out.println(h);
        }
    }
}