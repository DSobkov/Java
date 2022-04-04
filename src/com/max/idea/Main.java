package com.max.idea;
import java.util.Scanner;
//Завдання 1
class Main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double y,k,n;
        for (;;) {
            System.out.print("y=");
            y = sc.nextDouble(); /* Вводиться данні "y". */
            System.out.print("k=");
            k = sc.nextDouble(); /* Вводиться данні "k". */
            n = Math.sqrt(Math.sin(y)*2)+6.835/Math.log(y+k)+3*Math.pow(y,2) ;/* Формула варіанту 12*/
            if (!Double.isNaN(n)) { /* визначає чи є літерал або змінна нечисловим значенням isNan чи ні */
                System.out.println("n = "+n);
                break;
            }
            System.out.println("There are no solutions.\n");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(); /* Вводиться координата "x". */
        double y = sc.nextDouble(); /* Вводиться координата "x". */
        if (Math.abs(x)<=3 && Math.abs(y)<=3 && Math.abs(x)+Math.abs(y)>=3){ /* Обчислення точок де x, y <=-3 та >=3  12 варіант*/
            System.out.println("Fall into the shaded area.");
        } else {
            System.out.println("Do not fall into the shaded area.");
        }
    }
    }


//Завдання 3
class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the task number from 1 to 3 : "); /* Вибірка завдань задачі. */
        int lab3 = sc.nextInt();
        switch (lab3) { /* Перемикач між завданнями. */
            case 1 -> {
                System.out.println("Enter the first and last number : ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a > b) { /* "а" не може бути більше "b", тому що виводяться цифри від "а" до "b". */
                    System.out.println("Incorrect data! ");
                    break;
                }
                System.out.println("Enter the multiplicity number: ");
                int c = sc.nextInt();
                for (int i = a; i <= b; i++) {
                    if (i % c == 0)
                        System.out.println(i);
                }
            }
            case 2 -> {
                System.out.println("Enter the number: ");
                int n = sc.nextInt();
                int j = 0;
                int[] mas = new int[200];
                int res;
                int zero = 0, one = 0;
                for (int i = n; i != 0; i /= 2, j++) {
                    res = i % 2;
                    mas[j] = res;
                    if (mas[j] == 0)
                        zero++;
                    else if (mas[j] == 1)
                        one++;
                }
                System.out.println("Number of zeros --- " + zero);
                System.out.println("Number of units --- " + one);
            }
            case 3 -> {


                long pow = 1, sum = 0;
                for (int i = 1; i <= 9; i++) {                            //цикл по условию
                    for (int k = 0; k <= i; k++) {
                        sum+=k;
                    }
                    pow*=sum;
                    System.out.println(sum);
                    sum=0;                 //обнуляется сума после каждого цикла чтобы не накладывалась
                }
                System.out.println(pow); //1*3*6*10*15*21*28*36*45


            }

    }}}
//Завдання 4

class Main3{
    public static void main(String[] args) {
        double x = 0, i = 1, h = 0.1, y, pro = 0, last = 0;
        while (x <= i + 0.001) {
            y = (1/((Math.sin(x)*3)+5.4)-Math.log(x));
            if (Double.isNaN(y))
                System.out.print("x = " + x + "\t\t-"); /* \t  - значення табуляції */
            else
                System.out.print("x = " + x + "\t\t y = " + y + "\n");
            if (x == 0)
                pro = y;
            last = y;
            x += h;
        }
        System.out.println("\nProduct  = " + (pro * last)); //добуток завжди нескінченний
        System.out.print("Quantity: " + i/h+1);
    }
}
//Завдання 5
class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int sum = 0;
        int n = sc.nextInt();
        int i;
        for (i = 22; i <= n; i++) {            //цикл згідно 12 варіанту
            sum += i;
        }
            System.out.println("amount=" +sum);
        }
    }
