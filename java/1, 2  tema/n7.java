import java.util.Scanner;
public class n7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b= sc.nextInt(), c= sc.nextInt();
        if ((a+b>c) | (a+c>b) |(b+c>a))
        {
            System.out.print("Yes");
        }else
        {
            System.out.print("No");
        }
    }
}