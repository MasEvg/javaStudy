package ru.javalang.module03.tasks.t03;

import java.util.Scanner;

/**
 * Написать программу для проверки кратности числа X числу Y
 * (оба числа вводятся с клавиатуры).
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Vvedite chislo X: ");
        int x = in.nextInt();
        System.out.print("Vvedite chiso Y: ");
        int y = in.nextInt();

        if (x % y == 0) {System.out.print("Chislo " + x + " kratnoe chislu " + y);}
        else {System.out.println("Chislo " + x + " ne kratnoe chislu " + y);};
    }
}
