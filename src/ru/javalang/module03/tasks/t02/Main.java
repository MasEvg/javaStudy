package ru.javalang.module03.tasks.t02;

import java.util.Scanner;

/**
 * Ввести с клавиатуры число и проверить,
 * принадлежит ли это число диапазону от N до M (включительно).
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст человека: ");
        int n = in.nextInt();
        if (n >= 7 && n <= 18) {System.out.println("Данный персонаж скорее всего" + n + " ходит в школу");}
        else {
            System.out.println("Данный персонаж скорее всего " + n + " не ходит в школу");}


    }
}
