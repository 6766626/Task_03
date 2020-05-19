package by.iacademy.task03.task;

import java.util.Scanner;

public class Task06 {
    public static void task06(){

        int rez = 0;

        Scanner chislo = new Scanner(System.in);
        System.out.print("вводите любое целое положительное число: ");
        int num = chislo.nextInt();

        for (int i = 1;i<=num;i=i+1)
            rez = rez+i;
            System.out.println("сумма всех чисел до "+num + "="+rez);
    }
}
