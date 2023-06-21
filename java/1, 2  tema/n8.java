import java.util.Scanner;
public class n8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        if (x1+y1==x2+y2 | x1-y1==x2-y2){
            System.out.print("Да");
        }
        else{
            System.out.print("Нет");
        }
    }
}