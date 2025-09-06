import java.util.Scanner;

public class swaptwonumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("before swapping a="+a);
        System.out.println("before swapping b="+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping a="+a);
        System.out.println("after swapping b="+b);
    }
}

