import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, j = 1;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        for (int i = 1; i < number; i*=4) {
            System.out.println(i);
            if (j < number) {
                System.out.println(j);
            }
            j *= 5;
            j = j*5;
        }

    }
}

