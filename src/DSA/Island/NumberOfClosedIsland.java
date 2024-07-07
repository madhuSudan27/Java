package DSA.Island;

public class NumberOfClosedIsland {

    public int countClosedIsland(int [][] matrix){
        int res = 0;
        int row = matrix.length;
        int col = matrix[0].length;

        // need to also take care of visited

        boolean [][] visited = new boolean[row][col];

        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col ;j ++){
                // check and build and
                if(matrix[i][j] == 1 && !visited[i][j]){
                    // go and visit
                    if(isClosedIslandDfs(i, j, visited, matrix)){
                        res ++;
                    }
                }


            }
        }

        return res;
    }

    private  static boolean isClosedIslandDfs(int i, int j, boolean [][] visited , int [][] matrix){
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length){
            return  false;
        }
        if(matrix[i][j] == 0 || visited[i][j]) return  true;
        visited[i][j] = true;

        boolean ans = true;

        ans &= isClosedIslandDfs(i + 1, j , visited, matrix);
        ans &= isClosedIslandDfs(i - 1, j, visited, matrix);
        ans &= isClosedIslandDfs(i, j + 1, visited, matrix);
        ans &= isClosedIslandDfs(i , j - 1, visited, matrix);
        return ans;
    }

    public static void main(String[] args) {
        NumberOfClosedIsland obj = new NumberOfClosedIsland();
        System.out.println(obj.countClosedIsland(
            new int[][] {
                { 1, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 0 },
                { 0, 0, 1, 1, 0 },
                { 0, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0 }
            }
        ));
        System.out.println(obj.countClosedIsland(
            new int[][] {
                    { 0, 0, 0, 0 },
                    { 0, 1, 0, 0 },
                    { 0, 1, 0, 0 },
                    { 0, 0, 1, 0 },
                    { 0, 0, 0, 0 }
        }));

    }
}
