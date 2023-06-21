import java.util.Scanner;
public class w1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        int c=0;
        while (a<=b){
            if ((a%3==0)&(a%5!=0)){
                c+=1;
                a+=1;
            }
            else{
                a+=1;
            }
        }
        System.out.print(c);
    }
}