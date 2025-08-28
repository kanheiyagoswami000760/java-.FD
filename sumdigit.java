import java.util.Scanner;

public class sumdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number to find the sum of its digits:-");
        int n = sc .nextInt();
        int sum =0;
        int num = Math.abs(n);
        if (num ==0){
            sum =0;
        } else{
        } 
        while (num>0){
            int digit = num % 10;
            sum = sum + digit;
            num/=10;
        }
        System.out.println("the sum of digits in " + n + " is " + sum);
    }
}
