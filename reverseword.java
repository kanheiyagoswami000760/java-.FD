import java.util.Scanner;

import org.xml.sax.SAXException;

public class reverseword {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:-");
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

        }
        System.out.println("reversed string is:-" + rev);

    }
}
