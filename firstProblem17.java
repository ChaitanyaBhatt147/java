/*Converging Maze: Largest Sum Cycle
You are given a maze with N cells. Each cell may have multiple entry points but not more than one exit (ie. entry/exit points are unidirectional doors like valves).
The cells are named with an integer value from 0 to N-1.
You have to find:
The sum of the largest sum cycle in the maze. Return -1 if there are no cycles.
1. Sum of a cycle is the sum of the node number of all nodes in that cycle.
7
8
9
10
11
INPUT FORMAT:
1. The first line has the number of cells N.
2. The second line has a list of N values of the edgel] array. edge[i] contains the cell number that can be reached from of cell 'i' in one step. edge[i] is -1 if the 'i'th cell doesn't have an exit.
OUTPUT FORMAT:
Custo
Pass may
The first line denotes the sum of the largest sum cycle.
Sample Input and Output
Input:
23
4 4 1 4 13 8 8 8 0 8 14 9 15 11 -1 10 15 22 22 22 22 22 27*/
// Java code for the approach

import java.util.*;

public class firstProblem17 {
    // adjacency list
    static List<List<Integer> > adj = new ArrayList<>();
    // arrays for tracking visited nodes and their parent
    // nodes
    static int[] vis, par;
    // temporary list for storing nodes in a cycle
    static List<Integer> tmp = new ArrayList<>();

    // DFS function to find cycles and their sum
    static long dfs(int node, int p)
    {
        vis[node] = 1;
        par[node] = p;
        tmp.add(node);
        for (int i : adj.get(node)) {
            if (vis[i] == 0) {
                long z = dfs(i, node);
                if (z != -1) {
                    return z;
                }
            }
            else if (vis[i] == 1) {
                long sum = i;
                while (node != i) {
                    sum += node;
                    node = par[node];
                }
                if (node == i) {
                    return sum;
                }
                return -1;
            }
        }
        return -1;
    }

    // Function to find largest sum cycle
    static long largestSumCycle(int N, List<Integer> Edge)
    {
        long ans = -1;
        vis = new int[N];
        adj = new ArrayList<>(N);
        par = new int[N];

        // creating adjacency list
        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<>());
            if (Edge.get(i) != -1) {
                adj.get(i).add(Edge.get(i));
            }
        }

        // finding cycles and their sum using DFS
        for (int i = 0; i < N; i++) {
            if (vis[i] == 0) {
                ans = Math.max(ans, dfs(i, -1));
                for (int j : tmp) {
                    vis[j] = 2;
                }
                tmp.clear();
            }
        }

        return ans;
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> Edge = new ArrayList<>();
        for(int i = 0 ; i < N; i++){
            int temp = sc.nextInt();
            Edge.add(temp);
        }

        // Function Call
        long ans = largestSumCycle(N, Edge);
        System.out.println(ans);
    }
}