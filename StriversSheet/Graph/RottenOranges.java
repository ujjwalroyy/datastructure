package StriversSheet.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    static int rottenOranges(int grid[][]){
        int n = grid.length;
        int m = grid[0].length;
        Queue<Tuple> q = new LinkedList<>();
        int vis[][] = new int[n][m];
        int cntFresh = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 2){
                    q.add(new Tuple(i, j, 0));
                    vis[i][j] = 2;
                }
                if(grid[i][j] == 1){
                    cntFresh++;
                }
            }
        }
        int ans = 0;
        int delrow[] = {-1, 0, 1, 0};
        int delcol[] = {0, 1, 0, -1};
        int cnt = 0;
        while(!q.isEmpty()){
            int r = q.peek().first;
            int c = q.peek().second;
            int t = q.peek().third;
            q.remove();
            ans = Math.max(ans, t);
            for(int i = 0; i < 4; i++){
                int nrow = r + delrow[i];
                int ncol = c + delcol[i];
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][nrow] == 1){
                    q.add(new Tuple(nrow, ncol, t+1));
                    vis[nrow][ncol] = 2;
                    cnt++;
                }
            }
        }
        if(cnt != cntFresh){
            return -1;
        }
        return ans;
    }
    static class Tuple{
        int first;
        int second;
        int third;
        Tuple(int f, int s, int t){
            this.first = f;
            this.second = s;
            this.third = t;
        }
    }

    public static void main(String[] args) {
        int grid[][] = {{0, 1, 2},
                        {0, 1, 1},
                        {2, 1, 1}};

        rottenOranges(grid);
    }
}
