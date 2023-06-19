import java.util.*;

public class bubbleSort {
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
        // int nArray []= {7,8,3,2,1};
        // printArray(nArray);
        // time complexity = O(n^2)
        // bubble sort
        for (int i = 0; i < nArray.length - 1; i++) {
            for (int j = 0; j < nArray.length - i - 1; j++) {
                if (nArray[j] > nArray[j + 1]) {
                    // swap
                    int temp = nArray[j];
                    nArray[j] = nArray[j + 1];
                    nArray[j + 1] = temp;
                }
            }
        }
        System.out.println("\n");
        printArray(nArray);
    }
}
