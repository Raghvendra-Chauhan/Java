import java.util.Scanner;


public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'n' : ");
        int n = sc.nextInt();
        System.out.print("0,"+"1,");
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;

            System.out.print(b+",");

        }  
    }
}
