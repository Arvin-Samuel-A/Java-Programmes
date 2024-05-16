import java.util.HashMap;
import java.util.TreeMap;
import java.util.Scanner;


interface Var{

    HashMap<String, String> Data = new HashMap<String, String>();
    TreeMap<String, String> Sorted = new TreeMap<String, String >();
    Scanner Input = new Scanner(System.in);

    public void Print();

    public void Sort_and_Print();

}

class HM implements Var{

    HM(int Num){

        for (int x = 0; x < Num; x++){

            String Name, Sub;

            System.out.print("Enter the Name of Teacher " + (x+1) + " : ");
            Name = Input.nextLine();

            System.out.print(Name + " teaches the Subject : " );
            Sub = Input.nextLine();
            System.out.println();

            Data.put(Name, Sub);

        }

        System.out.println();

    }

    @Override
    public void Print(){

        for (String x : Data.keySet()){

            System.out.print("(" + x + " : " + Data.get(x) + ") ");

        }

    }

    @Override
    public void Sort_and_Print() {

        for (String x : Data.keySet()){

            Sorted.put(x, Data.get(x));

        }

        for (String x : Sorted.keySet()){

            System.out.print("(" + x + " : " + Data.get(x) + ") ");

        }

    }

}


public class Teacher_and_Subject {

    static Scanner Input = new Scanner(System.in);

    public static void main(String[] args){

        int Terms;

        System.out.println("We are going to Store the Name of Teachers and their Subjects!!!\n");

        System.out.print("Enter the Number of Records : ");
        Terms = Input.nextInt();
        System.out.println();

        HM Obj = new HM(Terms);

        System.out.print("The User created HashMap : { ");
        Obj.Print();
        System.out.print(" }\n");

        System.out.print("The HashMap after Sorting based on Names : { ");
        Obj.Sort_and_Print();
        System.out.print(" }\n");

    }

}