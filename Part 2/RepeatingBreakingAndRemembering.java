
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
     
        System.out.println("Give numbers:"); 
        while (input != -1){
            input = scanner.nextInt();
            sum += input;
            count++;
            
            if (input % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + (sum-(-1)));
        System.out.println("Numbers: " + (count-1));
        System.out.println("Average: " + 1.0*(sum+1)/(count-1));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + (odd-1));
        
    }
}
