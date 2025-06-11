public class Prime2 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            System.out.print(prime(i));
        }
    }
    public static int prime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return n;
        }
        else
        {
            return 0;
        }
    }

}
