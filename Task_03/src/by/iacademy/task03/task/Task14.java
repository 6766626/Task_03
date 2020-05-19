package by.iacademy.task03.task;

public class Task14 {
    public static void task14(){
        int n = 10;
        double rez = 0;
        double a;

        for (a = 1;a<=n; a = a + 1){
            rez = rez+1/a;
        }
        System.out.println(rez);
    }
}
