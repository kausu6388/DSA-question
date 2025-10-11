import java.util.*;

public class DifferenceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int min = arr[0], max = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
            if (i > max) max = i;
        }

        System.out.println("Difference = " + (max - min));
    }
}
