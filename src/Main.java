import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        double x = 10.35787;
        System.out.println(x);
        System.out.printf("Result = %.2f metros%n", x);

        String name = "Guilherme";
        int age = 19;
        double salary = 1500.0;

        System.out.printf("%s is %d years old e receives R$ %.2f reais%n", name, age,salary);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String username = scanner.nextLine();
        System.out.println("Hello, " + username + "!");
        scanner.close();
    }
}
