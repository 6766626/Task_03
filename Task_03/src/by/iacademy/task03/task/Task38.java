package by.iacademy.task03.task;

public class Task38 {
    public static void task38(){
        String a = "97532";
        char[] mas = a.toCharArray();

        int d = mas[1]-mas[0];
        int b = 0;

        for (int i = 1;i<a.length();i++) {
            if (mas[i] == mas[i-1] + d) {
                b = b+1;
            } else {
                b=0;
            }
        }
        if (b==(a.length()-1)){
            System.out.println("Это арифметическая прогрессия");
        }else {
            System.out.println("Это НЕ арифметическая прогрессия");
        }
    }
}
