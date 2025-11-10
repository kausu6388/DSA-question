// public class Example {
//     public static void printNumbers(int n) {
//         if(n > 10) {  // base condition to stop recursion
//             return;
//         }
//         System.out.println(n);
//         printNumbers(n + 1);  // recursive call
//     }

//     public static void main(String[] args) {
//         printNumbers(1);
//     }
// }


// print 1 to N using recursion
// import java.util.Scanner;
// public class Example {
//     public static void printNumbers(int n, int N) {
//         if(n > N) {  // base condition to stop recursion
//             return;
//         }
//         System.out.println(n);
//         printNumbers(n + 1, N);  // recursive call
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         printNumbers(1, N);
//     }
// }



// pprint N to 1 using recursion
import java.util.Scanner;
public class Example {
    public static void printNumbers(int n) {
        if(n < 1) {  // base condition to stop recursion
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printNumbers(N);
    }
}

