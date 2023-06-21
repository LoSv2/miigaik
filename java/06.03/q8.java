import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0, x=1;
        while (x<=a){
            int b=sc.nextInt();
            c+=1;
            x*=b;
        }
        System.out.print(c);
        System.out.print(" ");
        System.out.print(x);
    }
}
 