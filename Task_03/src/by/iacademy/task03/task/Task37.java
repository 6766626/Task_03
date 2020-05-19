package by.iacademy.task03.task;

public class Task37 {
    public static void task37(){
        int a;
        int a1;
        int b;
        int b1;

        for (a=10;a<100;a++){
            for (b=10;b<100;b++){
                int c1 = a*100+b;
                int c2 = b*100+a;

                if(c1%99==0 && c2%49==0){

                        a1 = c1/100;
                        b1 = c2/100;
                        System.out.println(a1+" "+ b1);

                }

            }
        }
    }
}
