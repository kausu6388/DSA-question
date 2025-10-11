import java.util.Scanner;

public class rotatedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        rotate(arr, d);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }

    // Rotates the array to the left by d positions
    private static void rotate(int[] arr, int d) {
        int n = arr.length;
        if (n == 0) return;
        d = d % n;
        if (d < 0) d += n;
        // left rotation by d: reverse 0..d-1, reverse d..n-1, reverse 0..n-1
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}