import java.util.Scanner;
public class n5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b=sc.nextInt();
        if (a!=0) {
            System.out.print('1');
        }else if(a==0 && b==0){
            System.out.print("inf");
        }else {
            System.out.print('0');
        }
    }
}