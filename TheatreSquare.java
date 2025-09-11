import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong(); 
        long m = sc.nextLong(); 
        long a = sc.nextLong(); 
        long tilesAlongN = (n + a - 1) / a;
        long tilesAlongM = (m + a - 1) / a;

        long totalTiles = tilesAlongN * tilesAlongM;

        System.out.println(totalTiles);

    }
}
