package by.iacademy.task03.task;

public class Task21 {
    public static void task21(){
        int a;
        int b;
        int h;
        double rez;

        for (a = 2, b = 5, h = 1;a<=b;a=a+h) {
                System.out.print(a+"   ");
                rez = a-Math.sin(a);
                System.out.println(rez);

        }
        System.out.println(" ");
    }
}
