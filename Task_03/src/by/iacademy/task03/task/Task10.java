package by.iacademy.task03.task;


import java.math.BigInteger;

public class Task10 {
    public static void task10(){
    BigInteger rez = BigInteger.valueOf(1);



    for (int i =1; i<=200;i++) {
        BigInteger rez1 = BigInteger.valueOf(i*i);
        rez = (rez.multiply(rez1));}

    System.out.println(rez);

    }
}
