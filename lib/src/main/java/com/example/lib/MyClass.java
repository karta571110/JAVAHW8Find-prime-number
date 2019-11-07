package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n;
        float count;

        System.out.println("若想得知1~n之中有哪些質數，請輸入n:");

        while (true) {

            n = scanner.nextFloat();
            if (n != (int) n) {

                System.out.println("請輸入整數");

            }
            if (n == (int) n) {
                for (int i = 1; i <= n; i++) {      //進行到n數
                    count = 0;


                    for (int j = 1; j <= i; j++) {  //對當前的n進行質數驗算
                        if (i % j == 0) {
                            count++;        //判斷因數數量
                        }

                    }
                    if (count == 2) {
                        System.out.println(i);
                    }

                }
                System.out.println("以上的數皆為質數\n\n可以再次輸入數字了");
            }
        }
    }
}
