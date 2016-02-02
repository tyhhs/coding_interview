package union;

import java.util.Scanner;

public class PassBall {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		int[][] dp = new int[30][30];
		dp[0][1] = 1;
		for(int i = 1; i <= m; i++){
			for(int j = 1; j <= n; j++){
				int x, y;
				x = j - 1;
				if(x == 0) x = n;
				y = j + 1;
				if(y == n + 1) y = 1;
				dp[i][j] = dp[i-1][x] + dp[i-1][y];
			}
		}
		System.out.println(dp[m][1]);
	}

}
