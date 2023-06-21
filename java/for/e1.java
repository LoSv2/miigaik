import java.util.Scanner;
public class e1 {
    public e1() {
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        int k = 0;

        for(int i = 2; i <= n; ++i) {
            int a = sc.nextInt();
            c += i;
            k += a;
        }
        System.out.print(c - k);
    }
}