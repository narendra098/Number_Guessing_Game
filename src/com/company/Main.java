package com.company;

import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(11);
        System.out.println(num);
        System.out.println("welcome user: ");
        System.out.println("Enter a number between 0 and 10: ");
        int i =4 ;
        while(i>0){
            int number = sc.nextInt();
            if(num==number){
                System.out.println("Congo!, you won");

            }
            else if(number>num){
                System.out.println("You have Entered Higher "+(i)+" Chances Remains");
            }
            else if(number<num){
                System.out.println("You have Entered Lower "+(i)+" Chances Remains");
            }
            else{
                System.out.println("Enter a valid number");
            }
            i--;
        }

    }
}
