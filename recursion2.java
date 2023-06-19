import java.util.*;

public class recursion2 {
    public static int first = -1;
    public static int last = -1;
    public static boolean[] map = new boolean[26];
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    // tower of hanoi
    public static long towerOfHanoi(int n, String src, String helper, String dest) {
        long count = (long) (Math.pow(2, n) - 1);
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return 1;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
        System.out.println(count);
        return count;
    }

    // print string in reverse
    public static void printString(String str, int idx) {
        if (idx < 0) {
            System.out.println();
            return;
        }
        System.out.print(str.charAt(idx));
        printString(str, idx - 1);
    }

    // find first and last occurence of a character
    public static void findOccurence(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurence(str, idx + 1, element);
    }

    // find if array is sorted or not
    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] >= arr[idx + 1]) {
            // array is sourted
            return false;
        }
        return isSorted(arr, idx + 1);
    }

    // move all x to the end of the string
    public static void moveAllX(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            moveAllX(str, idx + 1, count, newString);
        } else {
            newString += currChar;
            moveAllX(str, idx + 1, count, newString);
        }
    }

    // remove duplicates from string
    public static void duplicate(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            duplicate(str, idx + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            duplicate(str, idx + 1, newString);
        }
    }

    // print all substring of a string
    public static void substring(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // to be
        substring(str, idx + 1, newString + currChar);
        // not to be
        substring(str, idx + 1, newString);
    }

    // print all substring of a string using hashset
    public static void substringHashSat(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        // to be
        substringHashSat(str, idx + 1, newString + currChar, set);
        // not to be
        substringHashSat(str, idx + 1, newString, set);
    }

    // print all the combination of keypad
    public static void keyPadSubstring(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            keyPadSubstring(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(towerOfHanoi(n, "1", "2", "3"));
        // String str = sc.nextLine();
        // printString(str, str.length()-1);
        // String str = sc.nextLine();
        // char x = sc.next().charAt(0);
        // findOccurence(str, 0, x);
        // int n = sc.nextInt();
        // int sort[] = new int[n];
        // for (int i = 0; i < sort.length; i++) {
        // sort[i]=sc.nextInt();
        // }
        // System.out.println(isSorted(sort, 0));
        // String str = "axbcxdxxa";
        // moveAllX(str, 0, 0, "");
        // String str = sc.nextLine();
        // duplicate(str, 0, "");
        // String str = sc.nextLine();
        // substring(str, 0, "");
        // String str = sc.nextLine();
        // HashSet<String> set = new HashSet<>();
        // substringHashSat(str, 0, "", set);
        // String str = sc.nextLine();
        // keyPadSubstring(str, 0, "");
    }

}
