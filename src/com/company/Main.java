package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Введите ключ");
        String key = sc.nextLine();
        System.out.println("Введите сообщение");
        String message = sc.nextLine();
        message = encode(message, key);
        System.out.println(message);
        System.out.println(decode(message, key));
    }

    public static String encode(String message, String key) {
        String result = "";
        for (int i = 0; i < message.length(); i++) {
            // Складываем по модулю 2
            int c = (key.charAt(i % key.length()) ^ message.charAt(i));
            result += Character.toString(c);
        }
        return result;
    }

    public static String decode(String message, String key) {
        String result = "";
        for (int i = 0; i < message.length(); i++) {
            // Складываем по модулю 2
            int c = (key.charAt(i % key.length()) ^ message.charAt(i));
            result += Character.toString(c);
        }
        return result;
    }

}
