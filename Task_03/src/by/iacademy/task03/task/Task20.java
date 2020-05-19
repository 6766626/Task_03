package by.iacademy.task03.task;

public class Task20 {
    public static void task20(){
        double n = 0.1;
        double sum = 0;
        double[] a = new double[10];

        for (int i = 0; i < a.length; i++){
            a[i] = (1/((3*n-2)*(3*n+1)));
            if (Math.abs(a[i])>=n){
                sum = sum+a[i];
            }
        }
        System.out.println("sum="+sum);
    }
}
