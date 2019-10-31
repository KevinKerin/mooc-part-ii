
public class Main {

    public static void main(String[] args) {
        System.out.println(clockTime("00:24:24"));
        System.out.println(clockTime("23:45:60"));
        System.out.println(clockTime("15:22:58"));
        System.out.println(clockTime("abcdefg"));
    }
    
    public static boolean isAWeekDay(String string){
        return(string.matches("mon|tue|wed|thu|fri|sat|sun"));
    }

    public static boolean allVowels(String string){
        return(string.matches("[aeiouäö]*"));
    }
    
    public static boolean clockTime(String string){
        return string.matches("([01][0-9]|2[0-3])(:[0-5][0-9]){2}");
    }
    
}
