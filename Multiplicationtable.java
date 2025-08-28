import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to print its multiplication table:-");
        int n = sc.nextInt();
        for (int i=1; i<=10; i++){
            int table = n * i;
            System.out.println(n + " * " + i + " = " + table);
        }
    }
}
