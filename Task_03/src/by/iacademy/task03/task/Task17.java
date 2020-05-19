package by.iacademy.task03.task;

public class Task17 {
    public static void task17(){
        int a = 3;
        int n = 10;
        int i;
        long rez=a;

        for (i = 1;i<n;i++){
            rez=rez*(a+i);}

        System.out.println(rez);
    }
}
