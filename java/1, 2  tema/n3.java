import java.util.Scanner;
public class n3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b= sc.nextInt(), c= sc.nextInt();
        if ((a > c) & (a>b)) {
            System.out.print(a);
        }else if ((b>c) & (b>a)){
            System.out.print(b);
        }else if((c>b)&(c>a)){
            System.out.print(c);
        }
    }
}