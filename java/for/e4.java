import java.util.Scanner;
public class e4 {
    public e4() {
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int s = 0;
        for(int i = sc.nextInt(); i != 0; i = sc.nextInt()) {
            if (c < i) {
                c = i;
                s = 0;
            }
            if (c == i) {
                ++s;
            }
        }
        System.out.print(s);
    }
}