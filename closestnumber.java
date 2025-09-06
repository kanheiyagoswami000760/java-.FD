import java.util.Scanner;

public class closestnumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a,b and c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int diff1 = Math.abs(c - a);
        int diff2 = Math.abs(c - b);
        if(diff1 < diff2){
            System.out.println("a is the closest number to c");
        } else if(diff2 < diff1){
            System.out.println("b is the closest number to c");
        } else {
            System.out.println("both a and b are equally close to c");
        }
    }
}
