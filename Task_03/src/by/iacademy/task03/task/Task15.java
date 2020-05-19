package by.iacademy.task03.task;

public class Task15 {
    public static void task15(){
        double rez = 0;
        double a;
        double b = Math.pow(2,10);

        for (a = 1; a<=b;a++){
            rez = rez+a;
        }

        System.out.println(rez);
    }
}
