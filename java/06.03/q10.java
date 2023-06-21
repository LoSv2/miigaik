import java.io.PrintStream;
import java.util.Scanner;

public class q10 {
    public q10() {
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = "*";
        int i = 1;

        for(int j = 1; i <= n; j += 2) {
            PrintStream var10000 = System.out;
            String var10001 = " ".repeat(n - i);
            var10000.println(var10001 + a.repeat(j));
            ++i;
        }

    }
}
