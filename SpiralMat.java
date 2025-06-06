import java.util.*;
class SpiralMat {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
       ArrayList<Integer> spiral = new ArrayList<>();
        int row_start = 0, row_end = mat.length - 1;
        int col_start = 0, col_end = mat[0].length - 1;
        while(row_start <= row_end && col_start <= col_end){
            for(int i = col_start; i <= col_end; i++){
                spiral.add(mat[row_start][i]);
            }
            row_start++;
            for(int i = row_start; i <= row_end; i++){
                spiral.add(mat[i][col_end]);
            }
            col_end--;
            if(row_start <= row_end){
                for(int i = col_end; i >= col_start; i--){
                    spiral.add(mat[row_end][i]);
                }
                row_end--;
            }
            if(col_start <= col_end){
                for(int i = row_end; i >= row_start; i--){
                    spiral.add(mat[i][col_start]);
                }
                col_start++;
            }
        }
        return spiral;
    }
}
