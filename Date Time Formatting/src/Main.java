import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args){

        LocalDateTime Now = LocalDateTime.now();
        System.out.println("Before Formatting : " + Now);

        DateTimeFormatter Format = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");

        System.out.println("Formatted Date : " + Now.format(Format));

    }

}