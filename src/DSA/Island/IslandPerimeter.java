package DSA.Island;

public class IslandPerimeter {

    public int calculatePerimeter(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        boolean [][]visited = new boolean[row][col];
        int res = 0;

        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                if(matrix[i][j] == 1 && !visited[i][j]){
                    res += solution(i,j,visited, matrix);
                }
            }
        }
        return  res;

    }

    private  static  int solution(int i, int j, boolean[][] visited , int[][] matrix){
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length){
            return  1;
        }
        if(matrix[i][j] == 0) return 1;
        if(visited[i][j]) return 0;
        visited[i][j] = true;

        int edgeCount = 0;

        edgeCount += solution(i+1, j, visited, matrix);
        edgeCount += solution(i - 1, j,visited , matrix);
        edgeCount += solution(i , j + 1, visited, matrix);
        edgeCount += solution(i,j - 1, visited, matrix);

        return edgeCount;
    }

    public static void main(String[] args) {
        IslandPerimeter obj = new IslandPerimeter();
        System.out.println(obj.calculatePerimeter(
            new int[][] {
                    { 1, 1, 0, 0, 0 },
                    { 0, 0, 0, 0, 0 },
                    { 0, 0, 1, 1, 0 },
                    { 0, 1, 1, 0, 0 },
                    { 0, 0, 0, 0, 0 }
            }
        ));
        
    }
}
