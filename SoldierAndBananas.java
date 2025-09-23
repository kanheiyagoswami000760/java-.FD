import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int k = scanner.nextInt(); 
        int n = scanner.nextInt();  
        int w = scanner.nextInt(); 
        
        
        int totalCost = k * w * (w + 1) / 2;
        
        int borrow = totalCost - n;
        System.out.println(Math.max(borrow, 0));
        
       
    }
}