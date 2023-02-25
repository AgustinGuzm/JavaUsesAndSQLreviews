package com.gra;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        for (int operator = 1; operator <= 4; operator++) { //operator: 1- sum , 2- rest , 3- by , 4- div
            System.out.println("the operator is ..: "+operator);
            for (int i = 1; i <= 10; i++) { //i=i+1   to have the control of the table number (one, two , three, ...ten)
                System.out.println("the value of i is..:" + i);
                for (int j = 1; j <= 10; j++) { //to make detail of table (to make 1 by one;  one by two; ... one by ten)
                    //System.out.println("    the value of j is..:" + j);
                    if (operator == 1){
                        result = i + j;
                        System.out.println(i + " + " + j + " = " + result);
                    }
                    if (operator == 2){
                        result = i - j;
                        System.out.println(i + " - " + j + " = " + result);
                    }
                    if (operator == 3){
                        result = i * j;
                        System.out.println(i + " * " + j + " = " + result);
                    }
                    if (operator == 4){
                        result = i / j;
                        System.out.println(i + " / " + j + " = " + result);
                    }
                }
                System.out.println("==========================");
            }
        }
    }
}