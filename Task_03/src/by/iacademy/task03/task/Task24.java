package by.iacademy.task03.task;

import javax.swing.*;

public class Task24 {
    public static void task24(){
        int number = 1214132555;
        int summchet =0;
        int sumnechet = 0;
        int length = String.valueOf(number).length();




            for (int i=1;i<length;i++) {
                System.out.print(number%10);
                if ((number%10)%2 ==0 ){
                    summchet = summchet+number%10;
                }
                else {
                    sumnechet = sumnechet+number%10;
                }
                number = number/10;

            }

            System.out.println("\n" + "сумма четных =" + summchet +"; сумма нечетных ="+sumnechet);


    }
}
