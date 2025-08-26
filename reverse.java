import java.util.Scanner;

public class reverse {
    public int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("enter a number:");
        int n = in.nextInt();
        reverse sol = new reverse();
        int result = sol.reverse(n);
        System.out.println(result);
        in.close(); 
    }
}
