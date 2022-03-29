package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int matematik, fizik, kimya, türkçe, tarih, muzik;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Dersinizin Notunu Giriniz: ");
        matematik = input.nextInt();
        System.out.print("Fizik Dersinizin Notunu Giriniz: ");
        fizik = input.nextInt();
        System.out.print("Kimya Dersinizin Notunu Giriniz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe Dersinizin Notunu Giriniz: ");
        türkçe = input.nextInt();
        System.out.print("Tarih Dersinizin Notunu Giriniz: ");
        tarih = input.nextInt();
        System.out.print("Müzik Dersinizin Notunu Giriniz: ");
        muzik = input.nextInt();

        double result = ((matematik + fizik + kimya + türkçe + tarih + muzik) / 6);
        System.out.println("Ortalamanız : " + result);

        String str = result >= 60 ? "Tebrikler geçtiniz. " : "Üzgünüm kaldınız.";
        System.out.print(str);


    }
}


