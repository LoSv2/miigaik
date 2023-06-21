import java.util.Scanner;
public class n9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), m= sc.nextInt(), n= sc.nextInt();
        int time=0;
        while (n>0){
            time=time+(m*2);
            n=n-k;
        }
        System.out.print(time);
    }
}