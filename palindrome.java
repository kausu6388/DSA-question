// public class StringPalindrome {
//     public static void main(String[] args) {
//         String str = "racecar";
//         if (isPalindrome(str)) {
//             System.out.println(str + " is a palindrome.");
//         } else {
//             System.out.println(str + " is not a palindrome.");
//         }
//     }
//     public static boolean isPalindrome(String str) {
//         int left = 0;
//         int right = str.length() - 1;

//         while (left < right) {
//             if (str.charAt(left) != str.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }
// }
import java.util.Scanner;
public class palindrome{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String org = str;
        
        String rev = "";
        int length  = str.length();
        for(int i = length-1; i >=0; i--){
            rev = rev+str.charAt(i);
        }
       
        if(org.equals(rev)){
            System.out.println("palindrome string");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}