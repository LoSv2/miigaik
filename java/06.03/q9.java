import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String c="";
        while (a!=0){
            a-=1;
            c+="*";
            System.out.println(c);
        }
    }
}