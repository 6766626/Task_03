package by.iacademy.task03.task;

public class Task12 {
    public static void task12(){
    int a = 1;
    int rez=1;
    long rez1 =1;

    for (a=2;a<11;a++) {
        rez = (rez + 6);
        rez1 = rez1 * rez;
    }
    System.out.println(rez1);
    }
}
