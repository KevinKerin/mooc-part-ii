package dictionary;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MindfulDictionary dict = new MindfulDictionary("src/words.txt");
        Scanner reader = new Scanner(System.in);
        
        dict.load();
        dict.run();
        dict.save();
        
    }

}
