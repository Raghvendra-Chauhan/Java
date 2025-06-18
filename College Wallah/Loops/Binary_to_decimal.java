import java.util.Scanner;

public class Binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        int binary_num = sc.nextInt();
        int ans = 0;
        int pw=1;
        int unit_digit =0;
        while(binary_num>0){
            unit_digit = binary_num%10;
            ans = unit_digit*pw +ans;
            pw *= 2;
            binary_num /= 10;

        }
        System.out.println(ans);

    }
    
}
