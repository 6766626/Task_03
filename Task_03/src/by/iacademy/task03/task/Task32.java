package by.iacademy.task03.task;

public class Task32 {
    public static void task32(){
        String str = "Аргумент12_1";
        char[] mas = str.toCharArray();

        if (Character.isLetter(mas[0]) == true|| mas[0]=='_'){
            System.out.println("1ое условие выполнено - Первый символ буква или _");

        }else {
            System.out.println("1ое условие не выполнено - Первая буква не буква и не _");
        }
        int a = 0;
        for (int i = 1; i < mas.length; i++){
            if (Character.isLetter(mas[i]) == true|| mas[i]=='_'||Character.isDigit(mas[i])==true){

            }else {
                System.out.println(i+ "ой символ не верный. Вместо буквы, цифры или _ он ="+mas[i]);
                a = a+1;
            }

        }
        if (a == 0){
            System.out.println("2ое условие выполнено все символы = букве или цифре или _");}



    }
}
