import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner Count = new Scanner(System.in);
        double x  = Count.nextDouble();
        System.out.println("Введите ограничение: ");
        double f  = Count.nextByte();
        double sum = 0;
        if (x < 1 && x >= -1)
        {
            for (double i = 1; i <= f; i++)
            {
                sum += (Math.pow(x,i)/(i));
            }
            System.out.println(sum);
        }
        else {
            System.out.println("Число некорректно задано!");
        }
    }
}