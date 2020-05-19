package by.iacademy.task03.task;

public class Task29 {
    public static void task29(){
        String a = "678173638";
        String b = "123123123";
        char[] mas1 = a.toCharArray();
        char[] mas2 = b.toCharArray();

        System.out.print("Эти цифры совпадают в массивах: ");

        for (int i = 0; i < a.length(); i++)
        {
            for (int j = 0; j < b.length(); j++)
            {
                if (mas1[i] == mas2[j])
                {
                    System.out.print(mas1[i]+" ");
                    break;
                }
            }
        }



    }
}
