import java.util.Scanner;
public class n4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 4==0) {
            System.out.print("Да");
        }else{
            System.out.print("Нет");
        }
    }
}
 