import java.util.Scanner;

public class same_row_number_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = sc.nextInt();
        System.out.print("Enter no. of column : ");
        int m = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
