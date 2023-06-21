import java.util.Scanner;
public class w3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0;
        while (a!=0){
            b+=(a%10);
            a/=10;
        }
        System.out.print(b);
    }
}