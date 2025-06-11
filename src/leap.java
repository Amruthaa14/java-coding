import java.util.*;

public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 4 == 0) {
            if (n % 100 == 0) {
                if (n % 400 == 0) {
                    System.out.print("leap");
                } else {
                    System.out.print("not leap");
                }
            } else {
                System.out.print("leap");  // <-- Corrected here
            }
        } else {
            System.out.print("not leap");
        }
    }
}
