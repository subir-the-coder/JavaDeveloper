import java.util.Scanner;

public class ReverseString{
    public static void main(String args[]){
        System.out.println("# Enter the String to reverse: ");
        Scanner sc = new Scanner(System.in);
        String wordToReverse = sc.nextLine().trim();
        Reverser r = new Reverser(wordToReverse);
        System.out.println("Reversed String is: "+r.reverseEngine());
        if (wordToReverse.equals(r.reverseEngine())){
            System.out.println("# Its Palindrome");
        }else{
            System.out.println("# Its not Palindome");
        }

    }
}

class Reverser{
    String word;
    Reverser(String s){
        this.word = s;
    }
    String reverseEngine(){
        String reversedString = "";
        for(int i=0;i<word.length();i++){
            reversedString = word.charAt(i)+reversedString;
        }
        return reversedString;
    }
}
