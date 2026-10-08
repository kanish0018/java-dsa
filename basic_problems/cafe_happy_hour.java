package com.DSA.basic_problems;

import java.util.Scanner;

public class cafe_happy_hour {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String member = sc.next();
        double amt = sc.nextInt();
        double bill=0;
        boolean happyhours = sc.nextBoolean() ;
        // for vip
            if(member.equalsIgnoreCase("vip")) {
                bill = amt - (0.15 * amt);

                if (happyhours == true) {
                    bill = bill - (0.1 * bill);
                    System.out.println(bill);
                }
            }

            //for regular
                if(member.equalsIgnoreCase("regular")){
                   if(amt>20){
                       bill = amt-(0.10*amt);
                   } else if ( amt>20 && happyhours ) {

                           bill = amt -(0.15*amt);

                   } else if (amt<=20) {
                       bill = amt;
                   }
                    System.out.println(bill);

                   }

            //for guest
                if (member.equalsIgnoreCase("guest") ){
                    if(amt>50 && happyhours ){
                        bill = amt-5;
                    }
                    System.out.println(bill);
                }



        }

    }

