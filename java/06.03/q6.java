import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=0;
        int v=1;
        while (v!=0){
            int a=sc.nextInt();
            v=a;
            b+=a;
        }
        System.out.print(b);
    }
}
