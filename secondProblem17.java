import java.util.List;

public class secondProblem17 {
    public static int maxWeightCell(int N, List<Integer> Edge)
    {
          // Initializing temp with 0
        int[] temp = new int[N];
        
          // Traversing the Edge array
        for (int i = 0; i < N; i++) {
        
              // Checking if the value is not
            // equal to -1
            if (Edge.get(i) != -1) {
            
                  // Adding weight to the
                // destination cell
                temp[Edge.get(i)] += i;
            }
        }
    
          // Getting the index with
        // maximum value
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (temp[i] > max) {
                ans = i;
                max = temp[i];
            }
        }
        return ans;
    }

      // Drivers code
    public static void main(String[] args)
    {
          // Size of Edge
        int N = 4;
        List<Integer> Edge = Arrays.asList(2, 0, -1, 2);
        
          // Printing value
        System.out.println(maxWeightCell(N, Edge));
    }
}