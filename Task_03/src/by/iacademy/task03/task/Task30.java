package by.iacademy.task03.task;

public class Task30 {
    public static void task30(){

        int [] arab = new int[]{1,2,3,4,5,6,7,8,9,10};
        String [] rome = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X"};

        int chislo = 10;

        for (int i=0;i<10;i++) {
            if (arab[i] == chislo){

                System.out.println((arab[(i)])+" по арабски "+ rome[(i)]);
            }
        }

    }
}
