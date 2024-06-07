import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){

        long Num, Output;

        Scanner Input = new Scanner(System.in);

        System.out.println("We are going to Calculate the Factorial of a user-entered Number!!!\n");

        System.out.print("Enter the Number to Calculate the Factorial : ");
        Num = Input.nextInt();
        System.out.println();

        Output = factorial(Num);

        System.out.print("The Factorial of " + Num + " is : " + Output);

        Input.close();

    }

    static long factorial(long Num){

        if (Num>1) {

            return Num * factorial(Num - 1);

        }

        return Num;

    }

}
