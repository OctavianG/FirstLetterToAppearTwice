import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // Input: s = "abcdd"
    //Output: "d"
    //Explanation:
    //The only letter that appears twice is 'd' so we return 'd'.
    public static char repeatedCharacter(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (map.containsKey(currentChar)) {
                return currentChar;
            } else {
                map.put(currentChar, i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        System.out.println(repeatedCharacter(s));
    }
}