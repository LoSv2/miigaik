import java.util.Scanner;
public class w5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextInt(), b=sc.nextInt();
        int c=1;
        while (a<=b){
            c+=1;
            a+=a*0.1;
        }
        System.out.print(c);
    }
}