package by.iacademy.task03.task;

public class Task39 {
    public static void task39(){
        for (int i=100;i<1000;i++){
            int a,b,c;
            a = i/100;
            b = i/10-a*10;
            c = i-a*100-b*10;
            if (i==((b*10+c)*7)) {
                System.out.println(i);}}

        }
    }

