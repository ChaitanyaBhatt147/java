import java.util.*;

public class selectionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int n = sc.nextInt();
        int nArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            nArray[i] = sc.nextInt();
        }
        // time complexity = O(n^2)
        // Selection Sort
        for (int i = 0; i < nArray.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < nArray.length; j++) {
                if (nArray[smallest] < nArray[j]) {
                    smallest = j;
                }
            }
            int temp = nArray[smallest];
            nArray[smallest] = nArray[i];
            nArray[i] = temp;
        }
        System.out.println("\n");
        printArray(nArray);
    }
}
