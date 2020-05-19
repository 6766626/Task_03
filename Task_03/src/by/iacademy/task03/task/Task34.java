package by.iacademy.task03.task;

public class Task34 {
    public static void task34(){

            for (int a = 1000;a<10000;a++){
                int a1,a2,a3,a4;
                a1 = a/1000;
                a2 = a/100-a1*10;
                a3 = a/10-a1*100-a2*10;
                a4 = a - a1*1000-a2*100-a3*10;

                if ((a1+a2+a3+a4) == 15) {
                    System.out.println(a + " ");
                }


            }



    }
}
