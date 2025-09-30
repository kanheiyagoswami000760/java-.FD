import java.util.Scanner;

public class FenceWalk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();
        int h = scanner.nextInt();

        int totalWidth = 0;

        for (int i = 0; i < n; i++) {
            int height = scanner.nextInt();

        
            if (height <= h) {
                totalWidth += 1;
            } else {
                
                totalWidth += 2;
            }
        }

        System.out.println(totalWidth);
    }
}