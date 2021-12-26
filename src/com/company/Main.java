package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        double mny;
        System.out.print("Miktarı giriniz: ");
        mny=input.nextDouble();
        double kdvOranı=0.18;
        double sonuc;

        if (mny <=1000)
        {
            sonuc = mny+ mny*kdvOranı;
            System.out.println("KDV tutarı -> " + mny*kdvOranı);
            System.out.println("KDV'li fiyat -> " + sonuc);
        }
        else if (mny>1000)
        {
            kdvOranı=0.08;
            sonuc = mny + mny*kdvOranı;
            System.out.println("KDV tutarı -> "+mny*kdvOranı);
            System.out.println("KDV'li fiyat -> " + sonuc);
        }
        else
            System.out.println("ERROR");
    }
}
