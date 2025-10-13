import java.util.*;

public class EasyTwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();            // array size
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int target = sc.nextInt();       // target sum

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == target) {
                    System.out.println(i + " " + j);
                    return;              // stop after finding one pair
                }
            }
        }
        // no pair found: print -1 and exit main
        System.out.println(-1);
        return;

        
    }
}
