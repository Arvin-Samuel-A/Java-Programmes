import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int Terms, First, Second, Third;

        Scanner Read = new Scanner(System.in);

        System.out.println("We are going to print the Tribonacci Series!!!\n");

        System.out.print("Enter the Number of Terms : ");
        Terms = Read.nextInt();
        System.out.println();

        System.out.print("Enter the First Number : ");
        First = Read.nextInt();

        System.out.print("Enter the Second Number : ");
        Second = Read.nextInt();

        System.out.print("Enter the Third Number : ");
        Third = Read.nextInt();
        System.out.println();

        Tribonacci(Terms, First, Second, Third);

    }

    static void Tribonacci(int Terms, int Num1, int Num2, int Num3){

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