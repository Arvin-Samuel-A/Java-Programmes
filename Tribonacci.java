import java.util.Scanner;

public class Tribonacci {

    public static void main(String[] args){

        int Terms, First, Second, Third;

        Scanner Input = new Scanner(System.in);

        System.out.println("We are going to print the Tribonacci Series!!!\n");

        System.out.print("Enter the Number of Terms : ");
        Terms = Input.nextInt();
        System.out.println();

        System.out.print("Enter the First Number : ");
        First = Input.nextInt();

        System.out.print("Enter the Second Number : ");
        Second = Input.nextInt();

        System.out.print("Enter the Third Number : ");
        Third = Input.nextInt();
        System.out.println();

        tribonacci(Terms, First, Second, Third);
        
        Input.close();

    }

    static void tribonacci(int Terms, int Num1, int Num2, int Num3){

        int Temp1, Temp2;

        for (int x = 0; x < Terms; x++ ){

            System.out.println(Num1);

            Temp1 = Num1;
            Temp2 = Num2;
            Num1 = Num2;
            Num2 = Num3;
            Num3 += Temp1 + Temp2;

        }

    }

}