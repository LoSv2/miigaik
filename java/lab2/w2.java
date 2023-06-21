import java.util.Scanner;
public class w2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=2;
        while (c<=a){
            c+=1;
            if (a%c==0){
                System.out.print(c);
                break;
            }
        }
    }
}