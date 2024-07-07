package DSA.Island;

import java.util.HashSet;

public class IdenticalIsland {
    public int countIsland(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;

        // visited
        boolean [][] visited = new boolean[row][col];

        HashSet<String> uniquePath = new HashSet<>();

        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col ; j ++){
                if(matrix[i][j] == 1 && !visited[i][j]){

                    StringBuilder path = new StringBuilder();
                    getPathDfs(i, j,visited, matrix, path, "O");
                    uniquePath.add(path.toString());
                }
            }
        }

        return  uniquePath.size();
    }

    private  static  void getPathDfs(int i, int j, boolean[][] visited , int[][] matrix, StringBuilder path , String direction){

        if( i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length) return;
        if(matrix[i][j] == 0 || visited[i][j]) return;

        visited[i][j] = true;

        // now traverse and build the path
        path.append(direction);
        getPathDfs(i + 1, j, visited, matrix, path, "R");
        getPathDfs(i - 1, j , visited, matrix, path, "D");
        getPathDfs(i, j + 1, visited, matrix, path, "L");
        getPathDfs(i , j - 1, visited, matrix, path, "U");
    }

    public static void main(String[] args) {
        IdenticalIsland obj = new IdenticalIsland();
        System.out.println(obj.countIsland(
            new int[][]{
                { 1, 1, 0, 1, 1 },
                { 1, 1, 0, 1, 1 },
                { 0, 0, 0, 0, 0 },
                { 0, 1, 1, 0, 1 },
                { 0, 1, 1, 0, 1 }
            }
        ));

        System.out.println(obj.countIsland(
            new int[][] {
                { 1, 1, 0, 1 },
                { 0, 1, 1, 0 },
                { 0, 0, 0, 0 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 0 }
            }
        ));
    }
}
