package by.iacademy.task03.task;

public class Task36 {
    public static void task36(){

        for (int a = 10;a<100;a++) {
            for (int b = 10;b<100;b++ ){
                int ab = a*100+b;
                if (ab%(a*b)==0){
                    System.out.println(ab);
                }

            }


        }

    }
}
