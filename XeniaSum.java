import java.util.*;

public class XeniaSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] numbers = s.split("\\+");

        List<Integer> numList = new ArrayList<>();
        for (String num : numbers) {
            numList.add(Integer.parseInt(num));
        }
        Collections.sort(numList);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numList.size(); i++) {
            result.append(numList.get(i));
            if (i < numList.size() - 1) {
                result.append("+");
            }
        }

        
        System.out.println(result.toString());
    }
}
