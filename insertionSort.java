import java.util.*;

public class insertionSort {
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
        // insertion Sort
        for (int i = 1; i < nArray.length; i++) {
            int current =nArray[i];
            int j = i-1;
            while (j >=0 && current < nArray[j]) {
                nArray[j+1] = nArray[j];
                j--;
            }
            nArray[j+1] = current;
        }        
        System.out.println("\n");  
        printArray(nArray);
    }
}
