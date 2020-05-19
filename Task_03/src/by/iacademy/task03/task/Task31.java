package by.iacademy.task03.task;

public class Task31 {
    public static void task31(){

        int [] array1 = {2,5,10,15,18}; //Ввести числа, которые хочешь угадать тут!

        int[] array;
        array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 14)+1);
        }

        for (int i=0;i<5;i++){
            if (array[i] == array1[i]){
                System.out.println("УРА Ты угадал "+(i+1)+" цифру ="+array[i]);
               // System.out.println("Ты угадал "+(i+1)+" число"+ "число компа было =" +array[i]+ " , а твое "+array1(i));
            } else {
                System.out.println("ПИЧАЛЬКА  "+(i+1)+" цифра = "+array[i] +" , а ты ввел "+array1[i]);
                //System.out.println("Ты НЕ угадал "+(i+1)+" число"+ "число компа было =" +array[i]+ " , а твое "+array1(i));

            }
        }


    }
}
