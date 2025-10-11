                                 
                                 // public class reversestring {
//     public static void main(String[] args) {
//         String str = "Hello, World!";
//         String reversedStr = reverseString(str);
//         System.out.println("Reversed string: " + reversedStr);
//     }
//     static String reverseString(String str) {
//         StringBuilder reversed = new StringBuilder();
//         for (int i = str.length() - 1; i >= 0; i--) {
//             reversed.append(str.charAt(i));
//         }
//         return reversed.toString();
//     }
// }
import java.util.Scanner;
public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Using StringBuilder's reverse() method
        String reversedStr = new StringBuilder(str).reverse().toString();

        System.out.println(reversedStr);
    }
}