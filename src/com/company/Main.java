package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int maths , physics, chemistry, turkish , history, music;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Dersinizin Notunu Giriniz: ");
        maths  = input.nextInt();
        System.out.print("Fizik Dersinizin Notunu Giriniz: ");
        physics = input.nextInt();
        System.out.print("Kimya Dersinizin Notunu Giriniz: ");
        chemistry = input.nextInt();
        System.out.print("Türkçe Dersinizin Notunu Giriniz: ");
        turkish = input.nextInt();
        System.out.print("Tarih Dersinizin Notunu Giriniz: ");
        history = input.nextInt();
        System.out.print("Müzik Dersinizin Notunu Giriniz: ");
        music = input.nextInt();

        double result = ((maths + physics + chemistry + turkish + history + music) / 6);
        System.out.println("Ortalamanız : " + result);

        String str = result >= 60 ? "Tebrikler geçtiniz. " : "Üzgünüm kaldınız.";
        System.out.print(str);


    }
}


