package by.iacademy.task03.task;

public class Task23 {
    public static void task23(){

        double a;
        double b;
        double h;
        double rez;

        for (a = 2, b = 3, h = 0.5;a<=b;a=a+h) {
            System.out.print(a+"   ");
            rez = (1/Math.tan(a/3)+Math.sin(a)/2);
            System.out.println(rez);

        }
        System.out.println(" ");
    }
}
