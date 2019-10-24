
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString){
        if (characterString.length() % 2 == 1){
            characterString += " ";
        }
        int length = characterString.length();
        String topBottomLine = ":):):)";
        
        for (int i = 0; i < length/2; i++) {
            topBottomLine += ":)";
        }
        System.out.print(topBottomLine);
        System.out.println("\r");
        System.out.println(":) " + characterString + " :)");
        System.out.println(topBottomLine);
        
    }
    
}
