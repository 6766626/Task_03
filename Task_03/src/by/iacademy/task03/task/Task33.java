package by.iacademy.task03.task;

public class Task33 {
    public static void task33(){

        int a = 113833569;
        int a1 = a;
        int b;
        int c=1;
        int z = 0;

        do {
            a=a/10;
            c=c+1;
        }while (a>9);

        for (int i = 1;i<=c;i++){
            b = a1%10;
            a1 = a1/10;
            if (b>z){
                z = b;
            }

        }
        System.out.println(z);

    }
}
