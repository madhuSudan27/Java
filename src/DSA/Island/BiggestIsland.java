package DSA.Island;

public class BiggestIsland {

    int maxAreaOfIsland(int [][] matrix){
        int res = 0 ;
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                if(matrix[i][j] == 1){

                    res = Math.max( res ,dfs(i,j, matrix));

                }
            }
        }
        return res;
    }

    private static int dfs(int i, int j,int[][] matrix ){
        if( i < 0 ||  i >= matrix.length || j < 0 || j >= matrix[0].length){
            return 0;
        }
        // if already visited no need to revisit
        if(matrix[i][j] == 0) return 0;
        // mark the matrix
        matrix[i][j] = 0;

        int ans = 1;
        ans += dfs(i + 1, j , matrix);
        ans += dfs(i - 1, j , matrix);
        ans += dfs(i , j + 1, matrix);
        ans += dfs(i , j - 1, matrix);

        return  ans;
    }

    public static void main(String[] args) {
        BiggestIsland obj = new BiggestIsland();
        System.out.println(obj.maxAreaOfIsland(
                new int[][]{
                    {1, 1, 1, 0, 0},
                    {0, 1, 0, 0, 1},
                    {0, 0, 1, 1, 0},
                    {0, 1, 1, 0, 0},
                    {0, 0, 1, 0, 0}
                }));
    }
}
