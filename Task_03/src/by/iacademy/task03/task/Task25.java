package by.iacademy.task03.task;

public class Task25 {
    public static void task25(){

        int number = 25;
        int rez = 1;
        for (int i=1; i<number+1;i++){
            rez = rez*i;
        }
        System.out.println("факториал числа "+number+"="+rez);
    }
}
