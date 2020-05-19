package by.iacademy.task03.task;


public class Task11 {
    public static void task11(){
        int rez = 1;
        int rez1 = 1;



        for (int i =1; i<=200;i++) {
            rez1 = i * i * i;
            rez = rez - rez1;
        }


        System.out.println(rez);

    }
}
