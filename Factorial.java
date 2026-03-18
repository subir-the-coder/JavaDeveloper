
import java.util.Scanner;

class FactorialCalculator{
    int result=1;
    int calculate(int n){
        for(int i=1;i<=n;i++){
            result *= i;
        }
    return result;   
    }

}
public class Factorial{
    public static void main(String[] args) {
        System.out.print("# Enter the number to find factorial: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int num = sc.nextInt();
            FactorialCalculator fc = new FactorialCalculator();
            System.out.println(fc.calculate(num));
        }else{
            System.out.println("[!] AaAaa.... You need to enter a number");
        }
    }
}