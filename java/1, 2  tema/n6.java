import java.util.Scanner;
public class n6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b= sc.nextInt(), c= sc.nextInt();
        int f=(b*b)-4*a*c;
        if (f>0)
        {
            System.out.print("2");
        }else if (f==0)
        {
            System.out.print("1");
        }else
        {
            System.out.print("0");
        }
    }
}