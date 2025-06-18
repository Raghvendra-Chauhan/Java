import java.util.*;

public class array_ques {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int num [] = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter the values : ");
            num[i]=sc.nextInt();
        }
        System.out.print("Enter the number to check : ");
        int n1 = sc.nextInt();
        for (int i=0; i<n; i++) {
            if (num[i] == n1){
                System.out.print("Are you enter "+n1+" to check (1 - Yes / 0 - No) : ");
                int n2 = sc.nextInt(); 
                if(n2 == 1){
                    System.out.print("Index No. : "+i);
                }
                else{
                    System.out.print("Enter the number again!");
                    break;
                }
                
                

            }
                        
        }


    }
    
}


// import java.util.*;


// public class Arrays_Ques{
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int m = sc.nextInt();


//       int matrix[][] = new int[n][m];
//       for(int i=0; i<n; i++) {
//            for(int j=0; j<m; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//       }


//       System.out.println("The Spiral Order Matrix is : ");
//       int rowStart = 0;
//       int rowEnd = n-1;
//       int colStart = 0;
//       int colEnd = m-1;


//       //To print spiral order matrix
//       while(rowStart <= rowEnd && colStart <= colEnd) {
//           //1
//           for(int col=colStart; col<=colEnd; col++) {
//               System.out.print(matrix[rowStart][col] + " ");
//           }
//           rowStart++;


//           //2
//           for(int row=rowStart; row<=rowEnd; row++) {
//               System.out.print(matrix[row][colEnd] +" ");
//           }
//           colEnd--;


//           //3
//           for(int col=colEnd; col>=colStart; col--) {
//               System.out.print(matrix[rowEnd][col] + " ");
//           }
//           rowEnd--;


//           //4
//           for(int row=rowEnd; row>=rowStart; row--) {
//               System.out.print(matrix[row][colStart] + " ");
//           }
//           colStart++;


//           System.out.println();
//       }
//         System.out.print("Enter the of n: ");
//         int n = sc.nextInt();
//         int arr [] = new int[n];
//         for(int i=0;i<n;i++){
//             System.out.println("Enter elements : ");
//             arr[i] = sc.nextInt();
//         }
//         System.out.println(arr);




//    }
// }


