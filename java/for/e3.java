import java.util.Scanner;
public class e3 {
    public e3() {
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner rc = new Scanner(System.in);
        int a = sc.nextInt();
        String name = "";
        int age = false;
        float zn = 0.0F;
        for(int i = 1; i <= a; ++i) {
            name = rc.nextLine();
            int age = sc.nextInt();
            zn += (float)age;
        }
        System.out.print(zn / (float)a);
    }
}