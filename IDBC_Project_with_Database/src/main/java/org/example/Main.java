package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        MainOpr mainOpr=new MainOpr();

        System.out.println("--------------------Welcome! to IDBC Bank----------------------");
        while(true) {
            System.out.println("---------------------------Main Menu---------------------------");
            System.out.println("1) Create Account\n2) Already Holder\n0) Exit");
            System.out.println("---------------------------------------------------------------");
            int cho1 = scan.nextInt();

            if (cho1 == 1) {
                mainOpr.createAnAccount();
            }else if(cho1==2){
                mainOpr.loginOpr();
            }else {
                System.out.println("---------------------Thanks User for your time!------------------------");
                break;
            }
        }
    }
}