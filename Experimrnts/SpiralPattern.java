
// public class SpiralPattern {
//     public static void main(String[] args) {
//         int n = 5; // Size of the array
//         int[][] spiral = new int[n][n];

//         int value = 1;
//         int top = 0, bottom = n - 1, left = 0, right = n - 1;

//         while (value <= n * n) {
//             // Traverse from left to right
//             for (int i = left; i <= right; i++) {
//                 spiral[top][i] = value++;
//             }
//             top++;

//             // Traverse from top to bottom
//             for (int i = top; i <= bottom; i++) {
//                 spiral[i][right] = value++;
//             }
//             right--;

//             // Traverse from right to left
//             for (int i = right; i >= left; i--) {
//                 spiral[bottom][i] = value++;
//             }
//             bottom--;

//             // Traverse from bottom to top
//             for (int i = bottom; i >= top; i--) {
//                 spiral[i][left] = value++;
//             }
//             left++;
//         }

//         // Print the spiral pattern
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(spiral[i][j]);
//                 System.out.print("\t");
//             }
//             System.out.println();
//         }
//     }
// }