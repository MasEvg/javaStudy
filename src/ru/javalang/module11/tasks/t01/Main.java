package ru.javalang.module11.tasks.t01;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        try {
            System.out.println("Vvedite chislo: ");
            a = Integer.parseInt(bf.readLine());


            System.out.println("Vvedite chislo: ");
            b = Integer.parseInt(bf.readLine());

            System.out.println("Summ: " + (a+b));

        } catch (Exception e) {

            System.out.println("Sorry...");
            e.printStackTrace();

        }

    }

}