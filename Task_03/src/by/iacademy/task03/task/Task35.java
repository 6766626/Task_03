package by.iacademy.task03.task;

public class Task35 {
    public static void task35(){
        String a = "377311";
        int sum=0;
        char[] mas = a.toCharArray();


        for (int i=0;i<a.length();i++) {
            if (mas[i]%2==0){
                sum = sum+1;
            }



        }

        System.out.println(sum);
    }
}
