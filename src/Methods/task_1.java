package Methods;

import java.util.Scanner;

public class task_1 {
    public static void printGreeting(String name) {
        System.out.println("Привет, " + name + "!");
    }
    public static void main(String[] args) {
        System.out.print("Введите своё имя: ");
        Scanner scanner = new Scanner((System.in));
        String name = scanner.nextLine();
        printGreeting(name);
        scanner.close();
    }
}