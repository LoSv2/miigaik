import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите чётное количество пирожков ");
        int a = sc.nextInt();
        if (a >= 22) {
            System.out.print(a-10);
        }else {
            System.out.print(a / 2);
        }
    }
}