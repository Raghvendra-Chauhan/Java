import java.util.Scanner;

public class hollow_numerical_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            // n-i spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // print numbers
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
