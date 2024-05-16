import java.util.Scanner;

public class Spiral {

    static Scanner Input = new Scanner(System.in);

    public static void main(String[] args){

        double Left, Right;
        int N;

        System.out.print("Enter the x-coordinate of Left Point: ");
        Left=Input.nextDouble();

        System.out.print("Enter the x-coordinate of Right Point: ");
        Right=Input.nextDouble();

        System.out.print("Enter the Number of Arms in the Spiral: ");
        N=Input.nextInt();

        System.out.println();

        System.out.println("The Length of the " + N + " Arm of the Spiral is : " + Spiral_Recursive(Left, Right, N));

    }

    static double Spiral_Recursive(double Left, double Right, int N){

        if (N==0){

            return Left;

        }

        if (N==1){

            return Right;

        }

        return (Spiral_Recursive(Left, Right, N-1)+Spiral_Recursive(Left, Right, N-2))/2;

    }

}
