package org.example;

import java.util.Scanner;

public class App
{
    protected static void encryption(String val, int key) {
        String tmp = "";
        for (char i: val.toCharArray()) {
            tmp += (char) (i+key);
        }
        System.out.println(tmp);
    }

    protected static void decryption(String val, int key) {
        String tmp = "";
        for (char i: val.toCharArray()) {
            tmp += (char) (i-key);
        }
        System.out.println(tmp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fun = scanner.nextLine();
        String val = scanner.nextLine();
        int key = scanner.nextInt();
        if (fun.equals("enc")) {
            encryption(val, key);
        } else {
            decryption(val, key);
        }
    }
}
