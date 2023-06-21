import java.util.Scanner;
public class w4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float b=0;
        float count=-1;
        float v=1;
        while (v!=0){
            float a=sc.nextInt();
            v=a;
            b+=a;
            count+=1;
        }
        System.out.print(b/count);
    }
}
 
 