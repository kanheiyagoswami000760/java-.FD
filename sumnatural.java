import java.util.Scanner;

public class sumnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a natural number A:-");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        
    }
}
