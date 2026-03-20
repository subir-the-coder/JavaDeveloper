import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
    private String sentence;

    public Frequency(String sentence) {
        this.sentence = sentence;
        System.out.println("# Given sentence is: " + sentence);
        counter();
    }

    public void counter() {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : sentence.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println("\n# Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println("  '" + entry.getKey() + " appeared ' : " + entry.getValue()+" times");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("# Enter the sentence: ");
        String ip = scanner.nextLine();
        new Frequency(ip);
        scanner.close();
    }
}
