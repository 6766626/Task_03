package by.iacademy.task03.task;

import java.util.Scanner;

public class Task27 {
    public static void task27() {

        int m = 1;
        int n = 12;

        for (int i = m; i<=n; i++){
            for (int j=2; j<10;j++) {
                if ((i%j == 0)&&(i!=j))
                System.out.println("Один из делителей " + i+" это "+j);
            }
            }



        }


        }



