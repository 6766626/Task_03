package by.iacademy.task03.task;

public class Task40 {
    public static void task40(){
        int n = 99;
        int  i1, a, b;

        for (int i = 1; i < (n+1); i++) {
            i1 = i;
            a = 0;
            b = 0;
            while (i1 > 0) {
                a = a + 1;
                if (i1 % 10 != 0) {
                    if (i % (i1 % 10) == 0) {
                        b = b + 1;
                    }
                }
                i1 = i1 / 10;
            }
            if (a == b) {
                System.out.println(i);
            }

        }
    }
}