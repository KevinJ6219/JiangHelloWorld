import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name );
        System.out.println("THis is your first program o Intellij!");

    }
}
