import java.util.*;
import java.io.*;

public class quickSort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partitation(int[] arg, int low, int length) {
        int pivot = arg[length];
        int i = low - 1;
        for (int j = low; j <= length-1; j++) {
            if (arg[j] < pivot) {
                i++;
                swap(arg, i, j);
            }
        }
        swap(arg, i + 1, length);
        return i + 1;
    }

    private static void quickSort(int[] arg, int i, int length) {
        if (i < length){
            int pi = partitation(arg, i, length);
            quickSort(arg, i, pi - 1);
            quickSort(arg, pi + 1, length);
        }
    }

    private static void print(int[] arg) {
        for (int i = 0; i < arg.length; i++) {
            System.out.print(arg[i] + " ");
        }
        // System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arg = new int[n];
        for (int i = 0; i < arg.length; i++) {
            arg[i] = sc.nextInt();
        }
        quickSort(arg, 0, n-1);
        print(arg);
    }
}
