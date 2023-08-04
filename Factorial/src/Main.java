import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        long Num, Output;

        Scanner Input = new Scanner(System.in);

        System.out.println("We are going to Calculate the Factorial of a user-entered Number!!!\n");

        System.out.print("Enter the Number to Calculate the Factorial : ");
        Num = Input.nextInt();
        System.out.println();

        Output = Factorial(Num);

        System.out.print("The Factorial of " + Num + " is : " + Output);

    }

    static long Factorial(long Num){

        if (Num>1) {

            return Num * Factorial(Num - 1);

        }

        return Num;

    }

}
