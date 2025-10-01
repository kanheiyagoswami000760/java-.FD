import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine(); 

        int luckyDigitCount = 0;

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch == '4' || ch == '7') {
                luckyDigitCount++;
            }
        }
        if (isLuckyNumber(luckyDigitCount)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }

    public static boolean isLuckyNumber(int number) {
        String numStr = Integer.toString(number);
        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);
            if (ch != '4' && ch != '7') {
                return false;
            }
        }
        return true;
    }
}