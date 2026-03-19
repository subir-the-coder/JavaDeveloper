import java.util.ArrayList;
import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numberArray = new ArrayList<>();

        int counter = 1;

        while (true) {
            System.out.print("# Enter the " + counter + " number (Press Q to stop): ");

            if (sc.hasNextInt()) {
                numberArray.add(sc.nextInt());
                counter++;
            } else {
                String input = sc.next();
                if (input.equalsIgnoreCase("q")) {
                    break;
                } else {
                    System.out.println("Invalid input!");
                }
            }
        }

        FindingSecondLargest fsl = new FindingSecondLargest();
        fsl.numArray(numberArray);
    }
}

class FindingSecondLargest {

    void numArray(ArrayList<Integer> a) {

        int largest = Integer.MIN_VALUE; 
        int second = Integer.MIN_VALUE;

        for (int num : a) {

            if (num > largest) {
                second = largest;
                largest = num;
            } 
            else if (num > second && num != largest) {
                second = num;
            }
        }

        System.out.println("Second largest number is: " + second);
    }
}