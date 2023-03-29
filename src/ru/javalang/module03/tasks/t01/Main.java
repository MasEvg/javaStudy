package ru.javalang.module03.tasks.t01;

import java.util.Scanner;

/**
 *
 * Ввести число, и выяснить -
 * положительное оно, отрицательное, или равно нулю?
 *
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        if (n > 0) {
            System.out.println("Число " + n + " является положительным");}
        else if  (n < 0) {
            System.out.println("Число " + n + " является отрицательным");}
        else {
            System.out.println("Число " + n + " равно нулю");}


    }
}
