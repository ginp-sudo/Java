
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? \n");

        String name = scanner.nextLine();

        System.out.println("Hi " + name);

    }
}
