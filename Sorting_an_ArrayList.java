import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting_an_ArrayList {

    static ArrayList<Integer> Arr = new ArrayList<Integer>();

    public static void main(String[] args){

        int Terms;
        Scanner Input = new Scanner(System.in);

        System.out.println("We are going to Sort the user created ArrayList!!!\n");

        System.out.print("Enter the Number of Elements in the ArrayList : ");
        Terms = Input.nextInt();
        System.out.println();

        for (int x = 0; x < Terms; x++ ){

            int Num;

            System.out.print("Enter the Term " + (x+1) + " : " );
            Num = Input.nextInt();
            Arr.add(Num);

        }

        System.out.print("\nUser created ArrayList : [ ");
        Print_Arr(Arr);
        System.out.print("]\n\n");

        Collections.sort(Arr);

        System.out.print("ArrayList after Sorting : [ ");
        Print_Arr(Arr);
        System.out.print("]\n");


    }

    static void Print_Arr(ArrayList<Integer> List){

        for (int x : List){

            System.out.print(x + " ");

        }

    }

}
