package DSA.Island;

import java.util.Arrays;

public class FloodFill {

    public  int[][] floodFill(int x, int y, int color , int [][] matrix){

        int oldColor = matrix[x][y];
        if(matrix[x][y] != color)
            dfsFill(x, y, oldColor , color, matrix);
        return matrix;
    }

    private  static void  dfsFill(int x, int y, int oldColor, int newColor, int [][] matrix){
        // base case
        if(x < 0 || x >= matrix.length || y  < 0 || y >= matrix[0].length){
            return;
        }
        if(matrix[x][y] != oldColor) return;

        matrix[x][y] = newColor;

        dfsFill(x + 1, y, oldColor, newColor , matrix);
        dfsFill(x - 1, y , oldColor , newColor , matrix);
        dfsFill(x, y + 1, oldColor , newColor, matrix);
        dfsFill(x , y - 1, oldColor, newColor , matrix);
    }

    public static void main(String[] args) {

        FloodFill sol = new FloodFill();

        System.out.println(Arrays.deepToString(sol.floodFill(1, 3, 2,
                new int[][]{
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 1, 1},
                        {0, 1, 1, 1, 0},
                        {0, 1, 1, 0, 0},
                        {0, 0, 0, 0, 0}
                }
        )));

    }
}
