package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(ageTemp(20 , 10));
        System.out.println(ageTemp(99999999 , 8000));
        System.out.println(ageTemp(21 , 6));
        System.out.println(ageTemp(22 , 7));
        System.out.println(ageTemp(23 , 8));
        System.out.println(generateRandomAge()+" "+ageTemp(generateRandomAge() , 20));
    }
    public static String ageTemp(int age , int temp) {
        String toy1 = "Можно идти гулять ";
        String toy2 = "Нельзя идти гулять ";
        String toy3 = "Оставайтесь дома  ";

        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30 ) {
            return toy1;
        }else if (age < 20 && temp >= 0 && temp <= 28 ) {
            return toy1;
        }else {
            return toy3;
        }
    }
    public static int generateRandomAge(){
        Random random = new Random();
        int a = random.nextInt(1000);
        return a;
    }

}
