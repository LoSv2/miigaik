import java.util.Scanner;
public class n2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b= sc.nextInt(), c= sc.nextInt();
        if ((a*60*60+b*60) >= c) {
            System.out.print("Успел");
        }else{
            System.out.print("Опоздал");
        }
    }
}
 