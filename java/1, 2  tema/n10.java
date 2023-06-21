import java.util.Scanner;
class n10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n % 10;
        int b = n - a;
        String s = "";
        foo:{
            if (b - 50 >= 0){
                if (b == 90){
                    s = s + "XC";
                    break foo;
                }
                s = s+ "L";
                int c = b - 50;
                if (c / 10 > 0){
                    c = c / 10;
                    for (int p = 0; p < c; p++){
                        s = s + "X";
                    }
                }
            }
        }
        if (b < 50){
            b = b / 10;
            for (int p = 0; p < b; p++){
                s = s + "X";
            }
        }
        if (a == 1){
            s = s + "I";
        }
        if (a == 2){
            s = s + "II";
        }
        if (a == 3){
            s = s + "III";
        }
        if (a == 4){
            s = s + "IV";
        }
        if (a == 5){
            s = s + "V";
        }
        if (a == 6){
            s = s + "VI";
        }
        if (a == 7){
            s = s + "VII";
        }
        if (a == 8){
            s = s + "VIII";
        }
        if (a == 9){
            s = s + "IX";
        }
        System.out.println(s);
        sc.close();
    }
}