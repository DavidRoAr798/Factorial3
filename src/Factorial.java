import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int factorial= 1;
        int num;

        System.out.println("Hola, introduce un numero: ");
        num = sc.nextInt();

        for (int i= num; i>0; i--)
        {
            factorial = factorial * i;
        }

        System.out.println("El factorial es: " + factorial);





    }
}
