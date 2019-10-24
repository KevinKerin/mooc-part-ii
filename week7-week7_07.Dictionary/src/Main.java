
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        String input = "add\n"
                 + "capall\n" + "horse\n" + "add\n"
                 + "bo\n" + "cow\n" + "add\n"
                 + "madra\n" + "dog\n" + "add\n"
                 + "cat\n" + "cat\n" + "add\n"
                 + "aran\n" + "bread\n" + "add\n"
                 + "teach\n" + "house\n" + "add\n"
                 + "rothar\n" + "bicycle\n" + "add\n"
                 + "carr\n" + "car\n" + "add\n"
                 + "bord\n" + "table\n" + "quit\n";

        Scanner reader = new Scanner(input);
        Dictionary dictionary = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
             
    }
}
