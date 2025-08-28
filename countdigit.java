import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number to count its digits:-");
        int n = sc .nextInt();
        int count=0;
        int num = Math.abs(n);
        if (num ==0){
            count =1;
        } else{
        }
        while (num>0){
            num/=10;
            count++;
        }
        System.out.println("the number of digits in " + n + " is " + count);   
    }
}
