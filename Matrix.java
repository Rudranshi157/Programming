import java.util.*;
public class Matrix{

    //Spiral traversal
    //Given an m x n matrix, return all elements of the matrix in spiral order.
    // time complexity O(m*n)

    // space complexity O(1) because the algorithm uses only constant extra 
        //space, and the output space is not counted in auxiliary space.
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int rs =0, re = matrix.length-1 , cs = 0 , ce = matrix[0].length-1;
        while(rs <= re && cs <= ce){
            for(int i=cs; i<=ce; i++){
                res.add(matrix[rs][i]);
            }
            rs++;
            if(rs > re) return res;

            for(int i =rs; i<= re; i++){
                res.add(matrix[i][ce]);
            }
            ce--;
            if(cs > ce) return res;
            for(int i = ce; i>=cs; i--){
                res.add(matrix[re][i]);
            }
            re--;
            if(rs > re) return res;

            for(int i = re; i>= rs; i--){
                res.add(matrix[i][cs]);
            }
            cs++;
            if(cs > ce) return res;
        }
        return res;
    }
    public static void main(String args[]){

    }
}