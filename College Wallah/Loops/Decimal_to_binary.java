import java.util.Scanner;

public class Decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int decimal_num = sc.nextInt();
        int ans =0;
        int pw =1;
        int unit_digit = 0;
        while(decimal_num>0){
            unit_digit = decimal_num%2;
            ans = (unit_digit*pw) +ans;
            decimal_num /=2;
            pw *= 10;
        }
        System.out.println(ans);
    }
    
}
