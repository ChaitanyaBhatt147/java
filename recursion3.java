import java.util.*;

public class recursion3 {
    // print permutation of a string
    public static void printPermutation(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, permutation + currChar);
        }
    }
    
    // count path from 0,0 to n,m
    public static int countPath(int i, int j, int n, int m) {
        if (i == n || j == m)
            return 0;
        if (i == n - 1 && j == m - 1)
            return 1;
        // move down
        int dowmPath = countPath(i + 1, j, n, m);
        // move right
        int rightPath = countPath(i, j + 1, n, m);
        return dowmPath + rightPath;
    }

    // numbers of ways to place tiles
    public static int placeTiles(int n, int m) {
        if (n == m)
            return 2;
        if (n < m)
            return 1;
        // vertical
        int vertPlacement = placeTiles(n - m, m);
        // horizontal
        int horiPlacement = placeTiles(n - 1, m);
        return vertPlacement + horiPlacement;
    }

    // find the ways to invite people in party
    public static int callGuest(int n) {
        if (n <= 1)
            return 1;
        // single
        int ways1 = callGuest(n - 1);
        // paires
        int ways2 = (n - 1) * callGuest(n - 2);
        return ways1 + ways2;
    }

    // print subset
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i));
        }
        System.out.println();
    }

    // print subset of n natural numbers
    public static void subSetNNatural(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }
        // want to add
        subset.add(n);
        subSetNNatural(n - 1, subset);
        // not want to add
        subset.remove(subset.size() - 1);
        subSetNNatural(n - 1, subset);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // printPermutation(str, "");
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // System.out.println(countPath(0, 0, n, m));
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // System.out.println(placeTiles(n, m));
        // int n = sc.nextInt();
        // System.out.println(callGuest(n));
        int n = sc.nextInt();
        ArrayList<Integer> subset = new ArrayList<>();
        subSetNNatural(n, subset);
    }
}
