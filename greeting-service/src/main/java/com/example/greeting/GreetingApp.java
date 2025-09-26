package com.example.greeting;

import java.util.Scanner;

public class GreetingApp {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("名前を入力してください: ");
        String name = scanner.nextLine().trim();

        GreetingService service = new GreetingService();
        String message = service.greet(name);

        System.out.println(message);
        scanner.close();
    }


}
