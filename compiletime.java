public class compiletime {
    public int add(int a, int b) {
        return a + b;
    }
    public int add (int a, int b, int c) {
        return a + b + c;
    }
    public double add (double a, double b) {
        return a + b;
    }
}
public class TestCompiletime {
    public static void main(String[] args) {
        compiletime obj = new compiletime();
        System.out.println("Sum of two integers: " + obj.add(5, 10));
        System.out.println("Sum of three integers: " + obj.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + obj.add(5.5, 10.5));
    }
}
