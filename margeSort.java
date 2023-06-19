import java.util.*;

public class margeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        margeSort(arr, 0, arr.length - 1);
        // print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void margeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        margeSort(arr, si, mid);
        margeSort(arr, mid + 1, ei);
        marge(arr, si, mid, ei);
    }

    public static void marge(int[] arr, int si, int mid, int ei) {
        int[] sorted = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                sorted[x++] = arr[idx1++];
            } else {
                sorted[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            sorted[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            sorted[x++] = arr[idx2++];
        }
        for (int i = 0, j = si; i < sorted.length; i++ , j++) {
            arr[j]=sorted[i];
        }
    }
}
