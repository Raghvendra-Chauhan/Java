// import java.util.Scanner;
// public class Palindrome {
//     public static void main(String[] args) {

//       // palindrome of a number

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number to check  : ");
//         int n = sc.nextInt();
//         int temp = n;
//         int r, sum =0;
//         while(n>0) {
//             r = n%10;            sum = (sum*10)+r;
//             n = n/10;
//         }
//         if(sum==temp) {
//             System.out.println(sum+" is Palindrome");
//          } else{
//             System.out.println("Not Palindrome");
//         }

//     // Palindrome of a string

//       // String original, reverse = ""; // Objects of String class  
//       // // Scanner sc = new Scanner(System.in);   
//       // System.out.print("Enter a string/number to check if it is a palindrome : ");  
//       // original = sc.nextLine();   
//       // int length = original.length();   
//       // for (int i=length-1;i>=0;i--) {  
//       //    reverse = reverse + original.charAt(i);
//       // }
//       // if (original.equals(reverse)) { 
//       //    System.out.println("Entered string/number is a palindrome.");
//       // }
//       // else {
//       //    System.out.println("Entered string/number isn't a palindrome.");   
//       // }
//       // sc.close();
//    }
// }  
