package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int point;
        int passGrade = 60;

        Scanner input = new Scanner(System.in);

        System.out.print("Notunuzu giriniz :");
        point = input.nextInt();
        boolean condition = point < passGrade;

        String result = condition ? "Kaldınız" : "Geçtiniz";
        System.out.println(result);
    }


    }



