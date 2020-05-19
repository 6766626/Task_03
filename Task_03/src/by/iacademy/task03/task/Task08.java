package by.iacademy.task03.task;

public class Task08 {
    public static void task08(){
        int a;
        int b;
        int h;
        int c = 2;

        for (a = 2, b = 5, h = 1;a<=b;a=a+h) {
            if (a==15){
                System.out.print((a+c)*2+" ");
            }
            else {
                System.out.print((a-c+6)+" ");
            }
        }
        System.out.println(" ");
    }
}
