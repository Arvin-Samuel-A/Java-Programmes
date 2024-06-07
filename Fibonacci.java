import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args){

        int Terms, First, Second;

        Scanner Input = new Scanner(System.in);

        System.out.println("We are going to print the Fibonacci Series!!!\n");

        System.out.print("Enter the Number of Terms : ");
        Terms = Input.nextInt();
        System.out.println();

        System.out.print("Enter the First Number : ");
        First = Input.nextInt();

        System.out.print("Enter the Second Number : ");
        Second = Input.nextInt();

        System.out.println();

        fibonacci(Terms, First, Second);
        
        Input.close();

    }

    static void fibonacci(int Terms, int Num1, int Num2){

        int Temp;

        for (int x = 0; x < Terms; x++){

            System.out.println(Num1);
            Temp = Num1;
            Num1 = Num2;
            Num2 += Temp;

        }

    }

}
