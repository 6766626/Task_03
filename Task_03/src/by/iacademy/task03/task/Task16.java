package by.iacademy.task03.task;

public class Task16 {
    public static void task16(){
        int i;
        long rez = 1;
        long rez1 = 1;

        for (i = 1;i<=10;i++){
            rez1 = rez1+(i+1);
            rez = rez*rez1;
        }
        System.out.println(rez);
    }
}
