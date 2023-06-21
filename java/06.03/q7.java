import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        int c=0;
        while (c<a){
            c+=b;
        }
        System.out.print(c);
    }
}