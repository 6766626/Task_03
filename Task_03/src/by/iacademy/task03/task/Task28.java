package by.iacademy.task03.task;

import java.util.Scanner;

public class Task28 {
    public static void task28() {
        double x;
        double y;
        int a = 1;


        do {


            Scanner scanner = new Scanner(System.in);

            scanner = new Scanner(System.in);
            System.out.println("Введите символ +  -  /  * или 0 для выхода");
            String symbol = scanner.next();

            if (symbol.equals("0")) {
                a = 0;
                break;
            } else if (symbol.equals("/") || symbol.equals("+") || symbol.equals("-") || symbol.equals("*")) {

                System.out.println("Введите х:");
                x = scanner.nextInt();
                System.out.println("Введите y:");
                y = scanner.nextInt();


                if (symbol.equals("+")) {
                    System.out.println("x+y=" + (x + y));
                } else if (symbol.equals("-")) {
                    System.out.println("x-y=" + (x - y));
                } else if (symbol.equals("*")) {
                    System.out.println("x*y=" + (x * y));
                } else if (symbol.equals(("/")) && y == 0) {
                    System.out.println("На ноль делить нельзя");
                } else if (symbol.equals("/") && y != 0) {
                    System.out.println("x/y=" + x / y);
                }

            }else
                System.out.println("неверно введен символ");
        }while (a == 1) ;

    }
}
