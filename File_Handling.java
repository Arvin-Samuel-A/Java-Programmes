import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Handling {

    public static void main(String[] args){

        try {
            Input();
        }

        catch (IOException e){
            System.out.println("An error has occurred!!!");
        }

    }

    static void Create() throws IOException{

        File MyFile = new File("First.txt");

        System.out.println(MyFile.createNewFile() ? "My File is successfully Created" : "My File already exists");

    }

    static void Write() throws IOException{

        FileWriter Writer = new FileWriter("First.txt");

        Writer.write("Hello World\n");
        Writer.write("I am Learning File Handling in Java!!!");

        Writer.close();


    }

    static void Input() throws IOException, FileNotFoundException{

        File MyFile = new File("First.txt");

        Scanner Input = new Scanner(MyFile);

        while (Input.hasNextLine()){

            System.out.println(Input.nextLine());

        }
        
        Input.close();

    }

}
