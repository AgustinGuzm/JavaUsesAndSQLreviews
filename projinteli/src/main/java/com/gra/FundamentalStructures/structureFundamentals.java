package com.gra.FundamentalStructures;

import java.text.DecimalFormat;

public class structureFundamentals {
    public static void main(String[] args) {
        int operator = 1;
        while ( operator <= 4) { //operator: 1- sum , 2- rest , 3- by , 4- div
            System.out.println("the operator is ..: "+operator);
            int i = 1;
            while ( i <= 10) { //i=i+1   to have the control of the table number (one, two , three, ...ten)
                System.out.println("the value of i is..:" + i);
                int j = 1;
                while ( j <= 10) { //to make detail of table (to make 1 by one;  one by two; ... one by ten)
                    operation(operator, i, j);
                    j++;
                }
                System.out.println("==========================");
                i++;
            }
             operator++;
        }
    }
    public static void operation(int operator, int i, int j){
        int result = 0;
        switch (operator){
            case 1:
                result = i + j;
                System.out.println(i + " + " + j + " = " + result);
                break;
            case 2:
                result = i - j;
                System.out.println(i + " - " + j + " = " + result);
                break;
            case 3:
                result = i * j;
                System.out.println(i + " * " + j + " = " + result);
                break;
            case 4:
                DecimalFormat df = new DecimalFormat("###.##");
                Double resultd = Double.valueOf(i) /Double.valueOf(j) ;
                System.out.println( i + " / " + j + " = " + df.format(resultd));
                break;
        }
    }
}
