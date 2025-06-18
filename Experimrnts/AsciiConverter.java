
// import java.util.Scanner;

// public class AsciiConverter {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         sc.close();
//         // Take input string from the user
//         System.out.print("Enter a string: ");
//         String input = sc.nextLine();
        
//         // Convert characters to ASCII values and print them
//         System.out.println("ASCII values:");
//         for (int i = 0; i < input.length(); i++) {
//             char ch = input.charAt(i);
//             int asciiValue = (int) ch;
//             System.out.print(asciiValue + " ");
//         }
//         System.out.println();
        
//         // Add 3 to each ASCII value, convert back to characters, and print the modified string
//         System.out.print("Modified string:");
//         StringBuilder modifiedString = new StringBuilder();
//         for (int i = 0; i < input.length(); i++) {
//             char ch = input.charAt(i);
//             int asciiValue = (int) ch + 3;
//             char modifiedChar = (char) asciiValue;
//             modifiedString.append(modifiedChar);
//         }
//         System.out.println(modifiedString.toString());
//     }
// }

