import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting_a_LinkedList {

    static LinkedList<Integer> Arr = new LinkedList<Integer>();

    public static void main(String[] args){

        int Terms;
        Scanner Input = new Scanner(System.in);

        System.out.println("We are going to Sort the user created LinkedList!!!\n");

        System.out.print("Enter the Number of Elements in the LinkedList : ");
        Terms = Input.nextInt();
        System.out.println();

        for (int x = 0; x < Terms; x++ ){

            int Num;

            System.out.print("Enter the Term " + (x+1) + " : " );
            Num = Input.nextInt();
            Arr.add(Num);

        }

        System.out.print("\nUser created LinkedList : [ ");
        Print_Arr(Arr);
        System.out.print("]\n\n");

        Collections.sort(Arr);

        System.out.print("LinkedList after Sorting : [ ");
        Print_Arr(Arr);
        System.out.print("]\n");

        Input.close();

    }

    static void Print_Arr(LinkedList<Integer> List){

        for (int x : List){

            System.out.print(x + " ");

        }

    }

}
