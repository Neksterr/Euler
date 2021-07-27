package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       // int n = Integer.parseInt(scan.nextLine());
        int num1 = 0; int num2 = 1; int sumofTwo = 0; int sum = 0;
        while(num2 <= 4000000) {
            sumofTwo = num1 + num2;
            num1 = num2;
            num2 = sumofTwo;
            if(num2 % 2 == 0) {
                sum += num2;
            }
        }

        System.out.println(sum);
    }

}
