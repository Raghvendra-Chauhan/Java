
// import java.util.Arrays;
// import java.util.Scanner;

// public class merge_array {
//     public static void mergearray(int a1[], int a2[], int a3[]) {
//         int n1 = a1.length;
//         int n2 = a2.length;
//         int i=0,j=0,k=0;
//         while(i<n1){
//             a3[k++]=a1[i++];
//         }
//         while(j<n2){
//             a3[k++]=a2[j++];
//         }
//         Arrays.sort(a3);

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first5 array");
//         int n1=sc.nextInt();
//         int a1[]=new int[n1];
//         for(int i=0;i<n1;i++){
//             a1[i]=sc.nextInt();
//         }
//         System.out.println("Enter second array");
//         int n2 = sc.nextInt();
        
//         int a2[]=new int[n2];
//         for(int i=0;i<n2;i++){
//             a2[i]=sc.nextInt();
//         }
//         int a3[] = new int[a1.length+a2.length];
//         mergearray(a1, a2, a3);
//         System.out.print(Arrays.toString(a3));
        
//     }
    
// }
