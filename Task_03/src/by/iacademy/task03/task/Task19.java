package by.iacademy.task03.task;

public class Task19 {
    public static void task19(){

        double n = 0.1;
        double sum = 0;
        double[] a = new double[10];

        for (int i = 0; i < a.length; i++){
            a[i] = (1/(Math.pow(2,i))+1/(Math.pow(3,i)));
            if (Math.abs(a[i])>=n){
                sum = sum+a[i];
            }
        }
        System.out.println("sum="+sum);


    }
}
