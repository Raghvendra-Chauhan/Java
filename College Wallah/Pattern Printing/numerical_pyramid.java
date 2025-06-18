import java.util.Scanner;

public class numerical_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            // print n-i spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // print numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //print number in reverse order
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
