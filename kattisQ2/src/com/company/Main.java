package com.company;

import java.util.Scanner;

public class Main{

    public static void koordinatBul(int x,int y){

        int koordinat = 0;

        if(x < 0){
            if(y < 0){
                koordinat = 3;
                System.out.println(koordinat);
            }
            else if(y > 0){
                koordinat = 2;
                System.out.println(koordinat);
            }
        }
        else if(x > 0){
            if(y < 0){
                koordinat = 4;
                System.out.println(koordinat);
            }
            else if(y > 0){
                koordinat = 1;
                System.out.println(koordinat);
            }
        }


    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        koordinatBul(a,b);


    }

}