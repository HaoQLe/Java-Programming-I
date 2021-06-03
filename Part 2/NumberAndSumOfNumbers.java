
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        
        while (true){
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            count++;
            sum+= input;
            
            if (input == 0){
                System.out.println("Number of numbers: " + (count-1));
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
        }
    }
}
