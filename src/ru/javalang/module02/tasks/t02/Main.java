package ru.javalang.module02.tasks.t02;

import java.util.Scanner;

/**
 *
 * С клавиатуры вводится двузначное натуральное число.
 * Вывести на экран количество десятков в нем.
 *
 * For example:
 * Например:
 * --------------------------
 * |    Input   |   Result  |
 * --------------------------
 * |    45      |   4       |
 * --------------------------
 */

public class Main {
    public static void main(String[] args) {
        // Объявление и инициализация переменной 'in'
        Scanner in = new Scanner(System.in);
        System.out.print("Задача 2: Вывести на экран количество дестятков двухзначного числа.\nВведите двухзначное число");
        // Объявление и инициализация переменной 'x'
        int x = in.nextInt();
        int result = x/10;
        System.out.println("Количество дестяков в числе " + x + " равно " + result);

    }
}