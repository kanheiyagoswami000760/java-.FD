import java.util.Scanner;

public class sub {
    public static void main (String[] args){
        Scanner sc  = new Scanner (System.in);
        System.out.println("enter the value of A:-");
        int A = sc.nextInt();
        System.out.println("enter the number B:-");
        int B = sc.nextInt();

        int sub = A-B;
        System.out.println(sub);
        sc.close();

    }


}
