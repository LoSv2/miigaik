import java.util.Scanner;
public class e2 {
    public e2() {
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 1;
        for(int i = a; i > 0; i /= 10) {
            c *= i % 10;
        }
        System.out.print(c);
    }
}